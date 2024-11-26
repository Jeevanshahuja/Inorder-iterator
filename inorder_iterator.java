
class BSTIterator {
    public Stack<TreeNode> s = new Stack<>();
    public BSTIterator(TreeNode root) {
        Insertleft(root);
    }
    
    public int next() {
        TreeNode curr = s.pop();
        Insertleft(curr.right);
        return curr.val;
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    public void Insertleft(TreeNode root){
        while(root!=null){
            s.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */