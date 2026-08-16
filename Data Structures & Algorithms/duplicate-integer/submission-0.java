class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int val = map.getOrDefault(num, 0);
            if (val != 0) {
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int val : map.values()) {
            if (val > 1) return true;
        }

        return false;
    }
}