class Solution {
    public void reverseWords(char[] str) {
        reverse(str, 0, str.length - 1);
        int r = 0;
        while (r < str.length) {
            int l = r;
            while (r < str.length && str[r] != ' ') {
                r++;
            }
            reverse(str, l, r - 1);
            r++;
        }
    }
    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
