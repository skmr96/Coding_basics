 class Node
{
	int data;
	Node lc;
	Node rc;
	
	Node(int data)
	{
		this.data=data;
		lc=rc=null;
	}
	int getData()
	{
		return data;
	}
}
 class Tree
 {
	 Node root;
	 void insert(int x)
	 {
		 root=insert(root,x);
	 }
	 Node insert(Node root,int x)
	 {
		 if(root==null)
			 root=new Node(x);
		 else if(root.getData() > x )
			 root.lc=insert(root.lc,x);
		 else if (root.getData()<x)
			 root.rc=insert(root.rc,x);
		 return root;
	 }
	 boolean search(int v)
	 {
		 return search(root,v);
	 }
	 boolean search(Node root,int x)
	 {
		 boolean found = false;
		 while((root!=null) && !found)
		 {
			 if(root.getData()>x)
				 root=root.lc;
			 else if(root.getData()<x)
				 root=root.rc;
			 else
			 {
				 found = true;
				 break;
			 }
			 found = search(root,x);
		 }
		 return false;
	 }
	 void print()
	 {
		 print(root);
	 }
	 void print(Node root)
	 {
		 if(root == null)
			 return;
		 print(root.lc);
		 System.out.print(root.getData()+" ");
		 print(root.rc);
	 }
}
public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		t.insert(5);
		t.insert(6);
		t.insert(7);
		t.insert(4);
//		t.print();
		boolean f = t.search(4);
		System.out.println(f);
	}

}
