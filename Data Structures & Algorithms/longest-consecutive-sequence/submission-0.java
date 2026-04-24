class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] b = new int[max - min + 1];

        for (int num : nums) {
            b[num - min] = 1;
        }

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        maxCount = Math.max(maxCount, count);

        return maxCount;
    }
}