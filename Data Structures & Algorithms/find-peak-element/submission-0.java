class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[mid + 1]) {
                r = mid; // peak is on left side
            } else {
                l = mid + 1; // peak is on right side
            }
        }

        return l; // or r, both are same
    }
}