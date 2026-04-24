class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int pf = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
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