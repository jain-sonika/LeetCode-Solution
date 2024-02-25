class Solution {
    
    Map<Integer, List<Integer>> prime2index = new HashMap<>();

    int dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis){
        if(vis[node]==1) return 0;

        vis[node]=1;
        int result = 1;

        for(int nbr : adj.get(node)){
            if(vis[nbr]==0) result+=dfs(nbr, adj, vis);
        }
        return result;
    }

    public boolean canTraverseAllPairs(int[] nums) {
        if(nums.length==1) return true;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(temp==1) return false;

            for (int j = 2; j * j <= nums[i]; j++) {
                if (temp % j == 0) {
                    prime2index.computeIfAbsent(j, k -> new ArrayList<>()).add(i);
                    while (temp % j == 0)
                        temp /= j;
                }
            }
            if (temp > 1) {
                prime2index.computeIfAbsent(temp, k -> new ArrayList<>()).add(i);
            }
        }

        int n = nums.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++) {
            adj.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, List<Integer>> entry : prime2index.entrySet()) {
            List<Integer> value = entry.getValue();
            for(int i = 1; i < value.size(); i++){
                int u = value.get(i-1);
                int v = value.get(i);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
        }
        
        int[] vis = new int[n];
        if(dfs(0, adj, vis)==n) return true;
        return false;
    }
}
