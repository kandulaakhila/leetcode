class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totaltime=0;
        int groupsum=neededTime[0];
        int groupmax=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                 groupsum+=neededTime[i];
                 groupmax=Math.max(groupmax,neededTime[i]);
            }
            else{
                totaltime+=groupsum-groupmax;
                groupsum=neededTime[i];
                groupmax=neededTime[i];
            }
        }
        totaltime+=groupsum-groupmax;
        return totaltime;
        }
    }