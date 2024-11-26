/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Triplet
 {
     TreeNode curr;
     int v;
     int level;
     Triplet(TreeNode n,int i,int j)
     {
         curr=n;
         v=i;
         level=j;
     }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Triplet>q=new LinkedList<>();
        HashMap<Integer,HashMap<Integer,List<Integer>>>h=new HashMap<>();
        q.add(new Triplet(root,0,0));
        int min=(int)1e4;
        int max=-(int)1e4;
        int maxLevel=0;
        while(!q.isEmpty())
        {
            Triplet p=q.poll();
            TreeNode curr=p.curr;
            int ind=p.v;
            int level=p.level;
            min=Math.min(min,ind);
            max=Math.max(max,ind);
            maxLevel=Math.max(maxLevel,level);
            if(h.containsKey(ind)==false)
            h.put(ind,new HashMap<>());
            if(!h.get(ind).containsKey(level))
            h.get(ind).put(level,new ArrayList<>());
            h.get(ind).get(level).add(curr.val);
            if(curr.left!=null)
            q.add(new Triplet(curr.left,ind-1,level+1));
            if(curr.right!=null)
            q.add(new Triplet(curr.right,ind+1,level+1));

        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            List<Integer>ans1=new ArrayList<>();
            for(int j=0;j<=maxLevel;j++)
            {
                if(h.get(i).get(j)!=null)
                {
                //arr=h.get(i).get(j);
                List<Integer>arr=h.get(i).get(j);
                Collections.sort(arr);
                ans1.addAll(arr);
                }


            }
             ans.add(ans1);
        }
        return ans;



        
    }
}
