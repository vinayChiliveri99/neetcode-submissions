class Solution {
    public void moveZeroes(int[] nums) {
        // inplace.
        // move all non-zeroes forward
        // then fill rest places with zeroes.

        int n = nums.length;
        int nonZeroesIndex = 0;
        
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                nums[nonZeroesIndex] = nums[i];
                nonZeroesIndex++;
            }
        }

        while(nonZeroesIndex < n) {
            nums[nonZeroesIndex] = 0;
            nonZeroesIndex++;
        }
    }
}