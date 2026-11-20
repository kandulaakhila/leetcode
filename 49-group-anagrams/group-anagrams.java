class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //optimal solution
       HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append('#');
                key.append(count[i]);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());

            map.get(key.toString()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}