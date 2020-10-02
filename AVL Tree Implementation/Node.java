
public class Node {
	
	int data,bfactor;
	Node left,right;
	
	public Node() {
	}
	
	public Node(int d) {
		data=d;
		bfactor=0;
	}
	
	public int bfactor() {
		if(left==null&&right==null)
			return 0;
		else if(left==null)
			return right.height();
		else if(right==null)
			return left.height();
		else
			return Math.abs(left.height()-right.height());
	}
	
	public void updatebfactor() {
		if(left!=null)
			left.updatebfactor();
		bfactor=bfactor();
		if(right!=null)
			right.updatebfactor();
	}
	
	public void insert(int key) {
		if(key<data) {
			if(left==null)
				left=new Node(key);
			else
				left.insert(key);
		}
		else {
			if(right==null)
				right=new Node(key);
			else
				right.insert(key);
		}
	}
	
	public boolean search(int key) {
		if(key==data)
			return true;
		else if(key<data&&left!=null)
			return left.search(key);
		else if(key>data&&right!=null)
			return right.search(key);
		else
			return false;
	}
	
	public void inorder() {
		if(left!=null)
			left.inorder();
		System.out.print(data+"("+bfactor+") ");
		if(right!=null)
			right.inorder();
	}
	
	public void preorder() {
		System.out.print(data+"("+bfactor+") ");
		if(left!=null)
			left.preorder();
		if(right!=null)
			right.preorder();
	}
	
	public void postorder() {
		if(left!=null)
			left.postorder();
		if(right!=null)
			right.postorder();
		System.out.print(data+"("+bfactor+") ");
	}
	
	public void levelorder() {
		int h=height();
		for(int i=1;i<=h+1;i++)
			printLevel(i);
	}
	
	public void printLevel(int level) {
		if(level==1)	
			System.out.print(data+"("+bfactor+") ");
		else if(level>1) {
			if(left!=null)
				left.printLevel(level-1); 
			if(right!=null)
				right.printLevel(level-1); 
		}
	}
	
	public int height() 
	{ 
		if(left==null&&right==null)
			return 1;
		else if(left!=null&&right==null)
			return left.height()+1;
		else if(right!=null&&left==null)
			return right.height()+1;
		else {
			if(left.height()>right.height())
				return left.height()+1;
			else
				return right.height()+1;
		}
	} 
}
