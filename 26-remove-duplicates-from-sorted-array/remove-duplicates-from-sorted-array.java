class Solution {
    public int removeDuplicates(int[] nums) {
       //Better Solution 
       int n=nums.length;
       int []temp=new int[n];
       temp[0]=nums[0];
       int k=1;
       for(int i=1;i<n;i++){
         if (nums[i] != nums[i - 1]) {

                temp[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
}
