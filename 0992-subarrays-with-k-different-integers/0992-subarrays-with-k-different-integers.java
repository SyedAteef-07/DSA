import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countsub(nums, k) - countsub(nums, k - 1);
    }

    public int countsub(int[] nums, int k) {
        int n = nums.length;
        int l = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {  
                map.put(nums[l], map.get(nums[l]) - 1);  
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
