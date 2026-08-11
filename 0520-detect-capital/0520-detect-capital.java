class Solution {
    public boolean detectCapitalUse(String word) {

        int upper = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }

        // All uppercase
        if (upper == word.length()) {
            return true;
        }

        // All lowercase
        if (upper == 0) {
            return true;
        }

        // Only first letter uppercase
        if (upper == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}