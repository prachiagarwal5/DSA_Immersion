package lecture_11;
import java.util.*;
public class tree_implementation {
public class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
private Node root=null;
private static Scanner sc=new Scanner(System.in);
public tree_implementation() {
	this.root=createTree();
}
public void print(Node root) {
	if(root==null) {
		return;
	}
	System.out.println(root.left+"<---"+root.data+"<---"+root.right);
}
private Node createTree() {
	int data=sc.nextInt();
	Node node=new Node(data);
	int doesLeftChildPresent=sc.nextInt();
	if(doesLeftChildPresent==1) {
		node.left=createTree();
	}
	int doesRightChildPresent=sc.nextInt();
	if(doesRightChildPresent==1) {
		node.left=createTree();
	}
	return node;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
tree_implementation root=new tree_implementation();
root.print();
	}

}
