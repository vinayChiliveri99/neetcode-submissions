class Solution {
    public void moveZeroes(int[] nums) {
        // brute force, without inplace
        int n = nums.length;
        int ans[] = new int[n];

        int zeroesIndex = n-1;
        int nonZeroIndex = 0;
        for(int i=0; i<n && nonZeroIndex <= zeroesIndex; i++) {
            if(nums[i] == 0) {
                ans[zeroesIndex] = 0;
                zeroesIndex--;
            } else {
                ans[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        for(int i=0; i<n; i++) {
            nums[i] = ans[i];
        }
    }
}