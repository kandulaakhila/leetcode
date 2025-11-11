class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //optimal soluiton
        //create an empty list to store the result indices
        List<Integer>result=new ArrayList<>();
        //if s is shorter than pno anagrams are possible
        if(s.length()<p.length())return result;
        //Arrays to count characters(a-z)in p and current window s
        int []pcount=new int[26];
        int []scount=new int[26];
        //count frequency of characters in p and first window of s
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        //compare first window
        if(Arrays.equals(pcount, scount)) result.add(0);
        for(int i=p.length();i<s.length();i++){
            scount[s.charAt(i)-'a']++;//add new char
            scount[s.charAt(i - p.length())-'a']--;//remove old char
            if(Arrays.equals(pcount, scount)){
                result.add(i-p.length()+1);
            }
        }
        //return all starting indices of anagram
        return result;
    }
}