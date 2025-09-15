class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        if(brokenLetters.isEmpty()) return text.split(" ").length;
        Set<Character>brokenSet=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
            brokenSet.add(ch);
        }
        int count=0;
        for(String word:text.split(" ")){
            boolean cantype=true;
            for(char ch:word.toCharArray()){
                if(brokenSet.contains(ch)){
                    cantype=false;
                    break;
                }
            }
            if(cantype) count++;
        }
        return count;
    }
}
