class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            while(l < r && !isAlphaNum(arr[l])) {
                l++;
            }
            while(l < r && !isAlphaNum(arr[r])) {
                r--;
            }
            if (arr[l] != arr[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public boolean isAlphaNum(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
