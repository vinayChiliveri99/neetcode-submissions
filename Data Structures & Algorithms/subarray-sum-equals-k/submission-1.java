class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        int pf = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(pf, 1);

        for(int i=0; i<n; i++) {
            pf += nums[i];

            int remove = pf - k;

            if(hm.containsKey(remove)) {
                count += hm.get(remove);
            }

            hm.put(pf, hm.getOrDefault(pf, 0) + 1);
        }

        return count;
    }
}