import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length < 3 || nums.length > 3000) {
            return res;
        }

        for (int num : nums) {
            if (num < -100000 || num > 100000) {
                return res;
            }
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int second = i + 1;
            int third = nums.length - 1;

            while (second < third) {
                int sum = nums[i] + nums[second] + nums[third];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[second], nums[third]));

                    while (second < third && nums[second] == nums[second + 1]) {
                        second++;
                    }
                    while (second < third && nums[third] == nums[third - 1]) {
                        third--;
                    }

                    second++;
                    third--;
                } else if (sum < 0) {
                    second++;
                } else {
                    third--;
                }
            }
        }

        return res;
    }
}
