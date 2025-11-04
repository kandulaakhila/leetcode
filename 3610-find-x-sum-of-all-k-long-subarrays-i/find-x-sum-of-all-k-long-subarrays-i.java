class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer>result=new ArrayList<>();//final output list
        Map<Integer,Integer> freq=new HashMap<>();//how many times element appears in a window
        //step:1 Initialize freq map for first window
        for(int i=0;i<k;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        //step 2:process each window starting from index zero
        for(int i=0;i<=nums.length-k;i++){
            //step 3:build max-heap with custom comparator
            PriorityQueue<int[]>maxheap=new PriorityQueue<>(
                (a,b)->a[1]==b[1]?b[0]-a[0]:b[1]-a[1]
            );
            for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
                maxheap.offer(new int[]{entry.getKey(),entry.getValue()});
            }
            //step 4:extract top x elements and computesum
            int sum=0;
            for(int j=0;j<x && !maxheap.isEmpty();j++) {
                int[] top=maxheap.poll();
                sum+=top[0]*top[1];//value x frequency
            }
            result.add(sum);//store x-sum for current window
            //step 5: slide window forward(if not end)
             if (i + k < nums.length) {
            int out = nums[i];         // Element going out
            int in = nums[i + k];      // Element coming in

            // Remove outgoing element
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);

            // Add incoming element
            freq.put(in, freq.getOrDefault(in, 0) + 1);
        }
    }
    // Convert List<Integer> to int[] before returning
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}