class Solution {
    public int maxFreqSum(String s) {
        int maxvowels=0;
        int maxconsonant=0;
        String vowels="aeiou";
        //loop though all lowercase letters
        for(char ch='a';ch<='z';ch++){
            int count=0;
            //step count frquency of ch in the string
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch){
                    count++;
                }
            }
            //update max vowel or constant frequency
            if(vowels.indexOf(ch)!=-1){
                maxvowels=Math.max(maxvowels,count);//vowel
            }else{
                maxconsonant=Math.max(maxconsonant,count);//consonant
            }
        }
        return maxvowels+maxconsonant;
    }
}