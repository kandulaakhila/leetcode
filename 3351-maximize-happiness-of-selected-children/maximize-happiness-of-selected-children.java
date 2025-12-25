class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long total=0;
        int n=happiness.length;
        int picks=Math.min(k,n);
        for(int i=0;i<picks;i++){
            int val=happiness[n-1-i];
            int gain=Math.max(0,val-i);
            total+=gain;
        }
        return total;
    }
}