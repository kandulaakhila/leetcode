class Solution {
    public String sortVowels(String s) {
        String vowels="aeiouAEIOU";
        List<Character>vowelList=new ArrayList<>();
        //collect vowels
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                vowelList.add(c);
            }
        }
        //sort vowels
        Collections.sort(vowelList);
        //step 3: replace vowels in original string
        StringBuilder result=new StringBuilder();
        int index=0;
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                result.append(vowelList.get(index++));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}