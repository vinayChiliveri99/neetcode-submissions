class Solution {
    public int pivotIndex(int[] nums) {
        int sum = findSum(nums);
        int left = 0;

        for(int i=0; i<nums.length; i++) {
            if(left == sum - left - nums[i])
                return i;
            left += nums[i];
        }
        return -1;
    }

    int findSum(int [] n) {
        int sum = 0;
        for(int i: n) {
            sum += i;
        }

        return sum;
    }
}