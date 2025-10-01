class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totaldrunk=0;
        int empty=0;
        while(numBottles>0){
            totaldrunk=totaldrunk+numBottles;
            empty=empty+numBottles;
            numBottles=0;
            if(empty>=numExchange){
                numBottles=empty/numExchange;
                empty=empty%numExchange;
            }
        }
        return totaldrunk;
    }
}