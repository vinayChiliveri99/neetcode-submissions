class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n: nums) hs.add(n);

        int maxCount = 0;

        for(int n : hs) {
            if(!hs.contains(n-1)) {
                int count = 1;
                int current = n;

                while(hs.contains(current + 1)) {
                    count++;
                    current++;
                }

                maxCount = Math.max(count, maxCount);
            }

        }

        return maxCount;
    }
}
