
public class Driver {

	public static void main(String[] args) {
		AVLTree a=new AVLTree();
		a.insert(15);
		a.insert(20);
		a.insert(24);
		a.insert(10);
		a.insert(13);
		a.insert(7);
		a.insert(30);
		a.insert(36);
		a.insert(25);
		System.out.print("Balance factor of each node shown in paranthesis!");
		System.out.print("\nInorder : ");
		a.inorder();
		System.out.print("\nPreorder : ");
		a.preorder();
		System.out.print("\nPostorder : ");
		a.postorder();
		System.out.print("\nLevelorder : ");
		a.levelorder();
		System.out.print("\nIs 25 present in the BST : "+a.search(25));
		System.out.print("\nIs 11 present in the BST : "+a.search(11));
	}
}
