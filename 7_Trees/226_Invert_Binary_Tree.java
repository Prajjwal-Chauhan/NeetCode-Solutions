// using another function for recursion beats 100% in time and 95% in space

import java.util.*;

class Solution {

    public void recurse(TreeNode curr,TreeNode curr2){
        if(curr == null || (curr.left == null && curr.right == null)) return;
        if(curr.left != null) {
            TreeNode newnode1 = new TreeNode(curr.left.val);
            curr2.right = newnode1;
        }
        if(curr.right != null) {
            TreeNode newnode2 = new TreeNode(curr.right.val);
            curr2.left = newnode2;
        }
        recurse(curr.left,curr2.right);
        recurse(curr.right,curr2.left);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode head = new TreeNode(root.val);
        TreeNode curr = root;
        TreeNode curr2 = head;
        recurse(curr,curr2);

        return head; 
    }
}

// Uses same function for recursion beats 100% in time but 89% in space
class Solution2 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root; 
    }
}