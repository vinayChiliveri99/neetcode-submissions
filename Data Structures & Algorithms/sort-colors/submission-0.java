class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        int len = nums.length;

        for(int n: nums) {
            if(n == 0) red++;
            else if(n == 1) white++;
            else blue++;
        }

        for(int i=0; i<len; i++) {
            if(red > 0) {
                nums[i] = 0;
                red--;
            } else if(red == 0 && white > 0) {
                nums[i] = 1;
                white--;
            } else {
                nums[i] = 2;
                blue--;
            }
        }

        // return nums;
    }
}