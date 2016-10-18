import com.sun.org.apache.xpath.internal.operations.Bool;

public class Tree {
    private Node root;
    void insert(Node newNode){
        Node current = root;
        while(current != null){
            if(newNode.getValue() > current.getValue())
                current = current.getRight();
            else
                current = current.getLeft();
        }

        current = newNode;
    }

    Node search(int value){
        Node current = root;
        while(current != null){
            if(value == current.getValue())
                return current;

            if(value > current.getValue())
                current = current.getRight();
            else
                current = current.getLeft();
        }
        return null;
    }

    void inorder(Node node){
        if(node == null)
            return;
        inorder(node.getLeft());
        System.out.print(" " + node.getValue() + " ");
        inorder(node.getRight());
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public Node getLeft(){
        return this.left;
    }
    public void setLeft(Node node){
        this.left = left;
    }
    public Node getRight(){
        return this.right;
    }

    public void setRight(Node node){
        this.right = node;
    }
}
