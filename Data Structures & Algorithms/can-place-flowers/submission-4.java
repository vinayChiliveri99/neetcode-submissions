class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int ans = n;
        if (length == 1 && flowerbed[0] == 0) {
            return n <= 1;
        }
        if (length > 1 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1; 
            ans--;
        }
        for (int i = 1; i < length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                ans--;
            }
        }

        if (ans > 0 && length > 1 && flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            flowerbed[length - 1] = 1; 
            ans--;
        }
        
        return ans <= 0;
    }
}