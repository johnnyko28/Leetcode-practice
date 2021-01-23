/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        Node dummy = new Node(0, null, null);
        Node prev = dummy;
        prev = inorder(root, prev);
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right; 
    }
    
    private Node inorder(Node node, Node prev) {
        if (node == null) return prev;
        prev = inorder(node.left, prev);
        prev.right = node;
        node.left = prev;
        prev = inorder(node.right, node);
        return prev;
    }
} 
