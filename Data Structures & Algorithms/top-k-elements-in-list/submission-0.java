class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. freq map
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n: nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        // 2. build buckets of n+1 size
        int len = nums.length;

        // ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> buckets[] = new ArrayList[len+1];

        // 3. fill the buckets
        for(int key: hm.keySet()) {
            int freq = hm.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // 4. collect top k elements

        ArrayList<Integer> result = new ArrayList<>();
        int t = k;
        for(int i=len; i>=0 && k>0; i--) {
            if(buckets[i] != null) {
                for(int n: buckets[i]) {
                    result.add(n);
                    k--;
                    if(k == 0) break;
                }
            }
        }

        // 5. return ans array
        int ans[] = new int[t];
        for(int i=0; i<t; i++) {
            ans[i] = result.get(i);
        }

        return ans;

        // https://www.icloud.com/freeform-copy/6880FB27-28B5-4DC5-88BA-EC16C7D10E0D#347-top_k_frequent_elements

        // TC - O(N), SC - O(N)

    }
}
