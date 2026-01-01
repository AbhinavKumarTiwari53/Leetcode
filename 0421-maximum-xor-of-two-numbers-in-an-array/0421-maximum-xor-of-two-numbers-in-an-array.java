class Solution{
    class TrieNode{
        TrieNode[]child=new TrieNode[2];
    }
    TrieNode root=new TrieNode();
    void insert(int num){
        TrieNode node=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.child[bit]==null){
                node.child[bit]=new TrieNode();
            }
            node=node.child[bit];
        }
    }
    int getMaxXor(int num){
        TrieNode node=root;
        int max=0;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            int opp=1-bit;
            if(node.child[opp]!=null){
                max|=(1<<i);
                node=node.child[opp];
            }else{
                node=node.child[bit];
            }
        }
        return max;
    }
    public int findMaximumXOR(int[]nums){
        for(int n:nums) insert(n);
        int ans=0;
        for(int n:nums){
            ans=Math.max(ans,getMaxXor(n));
        }
        return ans;
    }
}