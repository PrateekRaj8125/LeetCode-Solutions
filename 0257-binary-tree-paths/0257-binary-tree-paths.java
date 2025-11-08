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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) 
            return result;
        helper(root, "", result);
        return result;
    }
    private void helper(TreeNode node, String path, List<String> result) {
        if (node == null) 
            return;
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }
        helper(node.left, path + node.val + "->", result);
        helper(node.right, path + node.val + "->", result);
    }
}