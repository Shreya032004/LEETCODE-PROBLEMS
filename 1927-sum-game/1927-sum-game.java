class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);
            if (c == '?') {
                leftQ++;
            } else {
                leftSum += c - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);
            if (c == '?') {
                rightQ++;
            } else {
                rightSum += c - '0';
            }
        }

        // Odd number of '?' -> Alice always wins
        if (((leftQ + rightQ) & 1) == 1) {
            return true;
        }

        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        // Bob wins only if this equality holds
        return diff != -(qDiff / 2) * 9;
    }
}