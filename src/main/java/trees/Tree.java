package trees;

public class Tree {
    private TreeNode root;

    public void insert(final int value){
        if(null == root){
            root=new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

public void traverseInOrder(){
        if(null != root){
            root.traverseInOrder();
        }
}
}
