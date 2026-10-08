class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans = 0;

        for (int house : houses) {
            int low = 0, high = heaters.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (heaters[mid] < house)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            int left = high >= 0 ? house - heaters[high] : Integer.MAX_VALUE;
            int right = low < heaters.length ? heaters[low] - house : Integer.MAX_VALUE;

            ans = Math.max(ans, Math.min(left, right));
        }

        return ans;
    }
}