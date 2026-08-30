class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] key = new int[26];
            for (char ch : str.toCharArray()) {
                key[ch - 'a']++;
            }

            String keyStr = Arrays.toString(key);
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        }

        return new ArrayList(map.values());
    }
}
