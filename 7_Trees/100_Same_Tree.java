// Beats 100% in time 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p!=null && q==null) || (p==null && q!=null)) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }
}
