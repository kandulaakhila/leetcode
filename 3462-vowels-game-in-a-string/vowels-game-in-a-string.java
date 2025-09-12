class Solution {
    public boolean doesAliceWin(String s) {
        //optimal solution
        int vowels=0;
        for(char c:s.toCharArray()){
            if(isvowel(c))vowels++;
        }
        return vowels>0;
    }
    private boolean isvowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}