class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder left=new StringBuilder();
        char middle='\0';
        for(int i=0;i<26;i++){
            int half=freq[i]/2;
            while(half-->0){
                left.append((char)(i+'a'));
            }
            if(freq[i]%2==1){
                middle=(char)(i+'a');
            }
        }
        StringBuilder right=new StringBuilder(left).reverse();
        if(middle!='\0'){
            left.append(middle);
        }
        left.append(right);
        return left.toString();
    }
}