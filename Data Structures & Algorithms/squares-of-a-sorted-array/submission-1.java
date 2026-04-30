class Solution {
    public int[] sortedSquares(int[] nums) {
        // Since the input array is sorted, the largest squares will be at either end
        int n = nums.length;
        int ans[] = new int[n];
        int l = 0, r = n-1, ansIndex = n-1;

        while(l <= r) {
            if(Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[ansIndex] = nums[l] * nums[l];
                l++;
            } else {
                ans[ansIndex] = nums[r] * nums[r];
                r--;
            }
            ansIndex--;
        }

        return ans;
    }
}