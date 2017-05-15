package Random;

public class Height {
	Node root;
	int rheight, lheight;
	public int height(Node root) {
		if(root == null) {
			return 0;
		} else {
		rheight = height(root.left);
		lheight = height(root.right);
		if(rheight > lheight) {
			return rheight + 1;
		} else {
			return lheight + 1;
		}
		}
		
	}
	
	public static void main(String[] args) {
		Height tree = new Height();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Height :" +tree.height(tree.root));
		
	}

}
