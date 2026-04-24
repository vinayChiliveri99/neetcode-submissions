class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        return (int)n * (int)n == num;
    }
}