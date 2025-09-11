class Solution {
    public String sortVowels(String s) {
        Set<Character>vowelSet=Set.of('a','e','i','o','u','A','E','I','O','U');
        List<Character>vowels=new ArrayList<>();
        //collect vowels
        for(char c:s.toCharArray()){
            if(vowelSet.contains(c)){
                vowels.add(c);
            }
        }
        //sort vowels
        Collections.sort(vowels);
        //step 3: replace vowels in original string
        StringBuilder result=new StringBuilder();
        int index=0;
        for(char c:s.toCharArray()){
            if(vowelSet.contains(c)){
                result.append(vowels.get(index++));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}