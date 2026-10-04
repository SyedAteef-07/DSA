class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int ss = 0, ts = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    ss++;
                    i--;
                } else if (ss > 0) {
                    ss--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    ts++;
                    j--;
                } else if (ts > 0) {
                    ts--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j))
                    return false;

                i--;
                j--;
            } else {
                if (i >= 0 || j >= 0)
                    return false;
            }
        }

        return true;
    }
}