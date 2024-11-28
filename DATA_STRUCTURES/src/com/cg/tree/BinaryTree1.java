package com.cg.tree;

import java.util.Scanner;

public class BinaryTree1 {
	    TreeNode root;
	 
	    // Method to insert a new node with the given value
	    void insert(int item) 
	    {
	        root = insertRec(root, item);
	    }
	    TreeNode insertRec(TreeNode root, int item) {
	        if (root == null) {
	            System.out.println("New Node created: " + item);
	            return new TreeNode(item);
	        }
	        if (item < root.data) {
	            root.left = insertRec(root.left, item);
	            if (root.left != null) {
	                System.out.println("Element on Left: " + root.left.data);
	            }
	        } else if (item > root.data) {
	            root.right = insertRec(root.right, item);
	            if (root.right != null) {
	                System.out.println("Element on Right: " + root.right.data);
	            }
	        }
	        return root;
	    }
	 
	    // Method to delete a node with the given value
	    void delete(int item) {
	        root = deleteRec(root, item);
	    }
	 
	   TreeNode deleteRec(TreeNode root, int item) {
	        if (root == null) {
	            System.out.println("Node not found: " + item);
	            return root; // Node not found
	        }
	 
	        if (item < root.data) {
	            root.left = deleteRec(root.left, item);
	        } else if (item > root.data) {
	            root.right = deleteRec(root.right, item);
	        } else {
	            // Node with only one child or no child
	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null) {
	                return root.left;
	            }
	 
	            // Node with two children:
	            //Get the inorder successor (smallest in the right subtree)
	            TreeNode succ = findMinimum(root.right);
	            root.data = succ.data; // Copy the inorder successor's content to this node
	            root.right = deleteRec(root.right, succ.data); // Delete the inorder successor
	        }
	        return root;
	    }
	   
	    // Method to search for a node with the given value
	    TreeNode search(TreeNode cur, int item, TreeNode parent) {
	        while (cur != null && cur.data != item) {
	            parent = cur;
	            if (item < cur.data) {
	                cur = cur.left;
	            } else {
	                cur = cur.right;
	            }
	        }
	        return cur; // Will return null if not found
	    }
	 
	    // Method to find the minimum value node in a subtree
	    TreeNode findMinimum(TreeNode cur) {
	        while (cur != null && cur.left != null) {
	            cur = cur.left;
	        }
	        return cur;
	    }
	 
	    // Method to perform in-order traversal of the tree
	    void inorderTraversal(TreeNode current) {
	        if (current != null) {
	            inorderTraversal(current.left);
	            System.out.print(current.data + " ");
	            inorderTraversal(current.right);
	        }
	    }
	 
	    // Utility method to start in-order traversal
	    void inorder() {
	        inorderTraversal(root);
	        System.out.println();
	    }
	 
	    // Method for pre-order traversal
	    void preorderTraversal(TreeNode node) {
	        if (node != null) {
	            System.out.print(node.data + " ");
	            preorderTraversal(node.left);
	            preorderTraversal(node.right);
	        }
	    }
	 
	    // Utility method to start pre-order traversal
	    void preorder() {
	        preorderTraversal(root);
	        System.out.println();
	    }
	 
	    // Method for post-order traversal
	    void postorderTraversal(TreeNode node) {
	        if (node != null) {
	            postorderTraversal(node.left);
	            postorderTraversal(node.right);
	            System.out.print(node.data + " ");
	        }
	    }
	 
	    // Utility method to start post-order traversal
	    void postorder() {
	        postorderTraversal(root);
	        System.out.println();
	    }
	 
	public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Display in-order traversal");
            System.out.println("4. Display pre-order traversal");
            System.out.println("5. Display post-order traversal");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    tree.insert(value);
                    System.out.println("Inserted: " + value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    tree.delete(value);
                    System.out.println("Deleted: " + value);
                    break;
                case 3:
                    System.out.println("In-order traversal:");
                    tree.inorder();
                    break;
                case 4:
                    System.out.println("Pre-order traversal:");
                    tree.preorder();
                    break;
                case 5:
                    System.out.println("Post-order traversal:");
                    tree.postorder();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 6);
        scanner.close();
    }
}