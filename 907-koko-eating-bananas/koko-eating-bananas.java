class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //optimal solution
        //time complexity:o(n.log(maxpile));
        //space complexity:o(1);
        int max=0;
        for(int p:piles){
            max=Math.max(max,p);
        }
        // binary search range[1...11]
        int low=1,high=max;
        while(low<high){
            int mid=low+(high-low)/2;//mid
            if (caneatall(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;//minimu  feasable speed 
    }
    //helper function to check feasability 
    private boolean caneatall(int []piles,int h,int k){
        int hours=0;
        for(int p:piles){
            hours+=(p+k-1)/k; //ceil(p/k);
            if(hours>h) return false;
        }
        return true;
    }
}