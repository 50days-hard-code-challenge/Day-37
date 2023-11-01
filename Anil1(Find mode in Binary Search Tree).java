class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Perform BFS , while queue is not empty
        while(!q.isEmpty()){
            // Remove Current node from from front queue
            TreeNode current = q.remove();
            map.put(current.val,map.getOrDefault(current.val,0)+1);

            // if currentnode.left is not equal to null, push it to q
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }

        }
        int maxFreq = 0;
        // Find the maximum value in map as maxFreq.
        for(int key : map.keySet()){
            maxFreq = Math.max(maxFreq,map.get(key));
        }
        // create a list to store max occurenc
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == maxFreq){
                ans.add(key);
            }
        }

        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
