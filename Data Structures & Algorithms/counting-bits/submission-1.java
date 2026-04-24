class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0; i<=n; i++) {
            ans[i] = countBitsInN(i);
        }
        return ans;
    }
    public int countBitsInN(int n) {
        int res = 0;
        for(int i=0; i<32; i++) {
            if(((1 << i) & n) != 0) res++;
        }
        return res;
    }
}
