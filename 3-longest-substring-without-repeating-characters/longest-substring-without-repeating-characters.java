class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxlen=0;
        Set<Character>set=new HashSet<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}