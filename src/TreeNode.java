import sun.reflect.generics.tree.Tree;

public class TreeNode {

    Object data;
    TreeNode left;
    TreeNode right;

    public TreeNode(Object data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void makeLeftSubTree(TreeNode sub){
        if(left != null) this.left = null;
        this.left = sub;
    }
    public void makeRightSubTree(TreeNode sub){
        if(right != null) this.right = null;
        this.right = right;
    }

    public Object getData(){
        return data;
    }
    public TreeNode getLeftSubTree(){
        return this.left;
    }

    public TreeNode getRightSubTree(){
        return this.right;
    }

    public static  void main(String[] args){

        TreeNode bt1 = new TreeNode(1);
        TreeNode bt2 = new TreeNode(2);
        TreeNode bt3 = new TreeNode(3);
        TreeNode bt4 = new TreeNode("song");

        bt1.makeLeftSubTree(bt2);
        bt1.makeRightSubTree(bt3);
        bt2.makeLeftSubTree(bt4);
    }

}
