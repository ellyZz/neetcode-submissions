class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (char ch : str.toCharArray()) {
                arr[ch - 'a']++;
            }
            String key = Arrays.toString(arr);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }

        return new ArrayList(result.values());
    }
}
