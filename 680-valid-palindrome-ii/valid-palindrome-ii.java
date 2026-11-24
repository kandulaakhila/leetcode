class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
        }
        return true;
    }
   // left + 1 → Ignore/delete the left character.
//right - 1 → Ignore/delete the right character.
//|| → If either possibility works, return true.
    private boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}