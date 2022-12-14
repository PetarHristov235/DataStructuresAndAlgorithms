package trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public void insert(final int value){
        if(value==data){
            return;
        }
        if(value<data){
            if(null == leftChild){
                leftChild= new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else{
            if(null == rightChild){
                rightChild=new TreeNode(value);
            }else {
                rightChild.insert(value);
            }
        }
    }
    public void traverseInOrder(){
        if(null != leftChild){
            leftChild.traverseInOrder();
        }
        System.out.println("Data="+data+", ");
        if(null != rightChild){
            rightChild.traverseInOrder();
        }
    }
    public TreeNode(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(final TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(final TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
