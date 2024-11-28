package com.cg.tree;

public class CreateTree {
	
	TreeNode root = null;
	
	public void insert(int item) 
	{
		root = insertRec(root,item);
	}
	
	public TreeNode insertRec(TreeNode root, int item) 
	{
		if(root == null) {
			root = new TreeNode(item);
			return root;
		}
		
		if(item < root.data) {
			root.left = insertRec(root.left,item);
		}
		else 
		{
			root.right = insertRec(root.right,item);
		}
		
		return root;
	}

	public void Inorder(TreeNode root) 
	{
			if(root == null) 
			{
				return;
			}
			
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
	}
	
	public void PreOrder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		System.out.print(root.data + " ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	
	public void PostOrder(TreeNode root) 
	{
		if(root == null) 
		{
			return;
		}
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public void display()
	{
		System.out.print("Inorder");
		Inorder(root);
		
		System.out.print("\nPreorder");
		PreOrder(root);
		
		System.out.print("\nPostorder");
		PostOrder(root);
	}
	
	public void search(int key)
	{
		if((search(root,key)==1))
		{
				System.out.println("\nApple found");
		}
		else
		{
			System.out.println("\nApple not found");
		}
	}
	public int search(TreeNode root, int key)
	{
		if(root==null)
		{
			return 0;
		}
		if(key==root.data)
		{
				return 1;
		}
		else if(key<root.data)
		{
				return search(root.left,key);
		}
		else
		{
				return search(root.right, key);
		}
	}
	
	public TreeNode delete (TreeNode curr, int item, TreeNode parent)
	{
		while((curr!=null)&&(curr.data!=item))
		{
			parent = curr;
			if(item<curr.data)
			{
				curr=curr.left;
			}
			else
			{
				curr = curr.right;
			}
		}
		return curr;
	}
	
	@SuppressWarnings("null")
	public void delete(int key)
	{
		TreeNode parent = null;
		TreeNode curr = root;
		curr = delete(curr, key, parent);
		if(curr==null)
		{
			System.out.println("Not found");
			return;
		}
		if(curr.left==null && curr.right==null)
		{
			if(curr!=root)
			{
				if(parent.left==curr)
				{
					parent.left=null;
				}
				else
				{
					parent.right=null;
				}
			}
		}
		else
		{
			root = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode root = null;
		CreateTree tree = new CreateTree();
		
		tree.search(1);
		
		tree.insert(10);
		tree.insert(20);
		tree.insert(5);
		tree.insert(1);
		tree.insert(3);
		tree.insert(15);
		tree.insert(18);
		
		tree.display();
		
		tree.search(1);
		tree.search(2);
		
		tree.delete(1);
		
		tree.display();
	}
}