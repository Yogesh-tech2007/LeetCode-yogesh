// Last updated: 13/08/2026, 15:54:39
import java.util.List;
import java.util.LinkedList;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorder(node.left, list);   
        list.add(node.val);         
        inorder(node.right, list);  
    }
}
