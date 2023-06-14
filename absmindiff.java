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
class Solution {
    public int minDiffInBST(TreeNode root) {
        ArrayList <Integer> list=new ArrayList<>();
        findans(root,list);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                if(list.get(i)!=list.get(j))
                {
                    int minus=Math.abs(list.get(i)-list.get(j));
                    ans=Math.min(ans,minus);
                }
            }
        }
        return ans;
    }
    public static void findans(TreeNode root,ArrayList <Integer> list)
    {
        if(root==null)
        {
            return ;
        }
        list.add(root.val);
        findans(root.left,list);
        findans(root.right,list);

    }
}