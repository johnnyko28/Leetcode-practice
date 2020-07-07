/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        ArrayList<Node> list = new ArrayList<>();
        
        Node dup = new Node(node.val, list);
        map.put(node, dup);
        for (Node neighbor : node.neighbors) {
            dup.neighbors.add(cloneGraph(neighbor));
        }
        return dup;
    }
}
