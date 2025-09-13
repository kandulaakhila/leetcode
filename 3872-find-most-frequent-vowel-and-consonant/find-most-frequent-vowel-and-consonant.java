class Solution {
    public int maxFreqSum(String s) {
        int []freq=new int[26];
        String vowels="aeiou";
        int maxvowels=0;
        int maxconsonant=0;
        //count freq using arrays
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            int count=freq[i];
            if(vowels.indexOf(ch)!=-1){
                maxvowels=Math.max(maxvowels,count);
            }
            else{
                maxconsonant=Math.max(maxconsonant,count);
            }
        }
        return maxvowels+maxconsonant;
    }
}

       