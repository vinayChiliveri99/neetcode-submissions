class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        int n = logs.length;
        if(n == 1 && (logs[0].equals("../") || logs[0].equals("./"))) return 0;
        for(int i=0; i<logs.length; i++) {
            if(logs[i].equals("../")) {
                if (ans > 0) ans--;
            } else if(logs[i].equals("./")) {
                // nothing
            } else {
                ans++;
            }
        }

        return ans;
    }
}