// Beats 96% in Time
class Solution {
    public boolean isIdentical(TreeNode s,TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null || s.val != t.val) return false;
        return isIdentical(s.left,t.left) && isIdentical(s.right,t.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null || isIdentical(root,subRoot)) return true;
        if(root == null) return false;

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
