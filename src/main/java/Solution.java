class Solution {
    private boolean isCapital(char c) {
        if (c >= 'A' && c <= 'Z')
            return true;
        return false;
    }

    public boolean detectCapitalUse(String word) {

        if (word.matches("[A-Z]+") || word.matches("[a-z]+") || word.matches("^[A-Z][a-z]+"))
            return true;

        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.detectCapitalUse("USA"));
    }

}
