
public class AVLTree {
	
	Node root;
	
	public void insert(int key) {
		if(root==null)
			root=new Node(key);
		else {
			root.insert(key);
			root.updatebfactor();
		}
	}
	
	public boolean search(int key) {
		if(root==null)
			return false;
		else
			return root.search(key);
	}
	
	public void inorder() {
		if(root==null)
			return;
		else {
			System.out.println();
			root.inorder();
		}
	}
	
	public void preorder() {
		if(root==null)
			return;
		else {
			System.out.println();
			root.preorder();
		}
	}
	
	public void postorder() {
		if(root==null)
			return;
		else {
			System.out.println();
			root.postorder();
		}
	}
	
	public void levelorder() {
		if(root==null)
			return;
		else {
			System.out.println();
			root.levelorder();
		}
	}
	
	public int height() {
		if(root==null)
			return 0;
		else
			return root.height();
	}
	
}
