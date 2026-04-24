class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1. hashset - O(N), O(N)
        // 2. hashset streams - O(N), O(N)

        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums) hs.add(num);

        return hs.size() != nums.length;

        // return Arrays.stream(nums).distinct().count() < nums.length
    }
}