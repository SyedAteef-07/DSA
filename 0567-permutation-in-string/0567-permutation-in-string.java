class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> fmap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            fmap.put(c, fmap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            Map<Character, Integer> smap = new HashMap<>();

            for (int j = i; j < i + s1.length(); j++) {
                char c = s2.charAt(j);
                smap.put(c, smap.getOrDefault(c, 0) + 1);
            }

            if (fmap.equals(smap)) {
                return true;
            }
        }

        return false;
    }
}