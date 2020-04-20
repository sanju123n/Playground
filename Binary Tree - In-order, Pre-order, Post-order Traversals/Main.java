#include<iostream>
#include<bits/stdc++.h>
#include <cstdio>
using namespace std;
 
struct Node {
	int data;
	struct Node *left;
	struct Node *right;
};

//Function to visit nodes in Preorder
void Preorder(struct Node *root) {
	// base condition for recursion
	// if tree/sub-tree is empty, return and exit
	if(root == NULL) return;

	printf("%d ",root->data); // Print data
	Preorder(root->left);     // Visit left subtree
	Preorder(root->right);    // Visit right subtree
}

//Function to visit nodes in Inorder
void Inorder(Node *root) {
	if(root == NULL) return;

	Inorder(root->left);       //Visit left subtree
	printf("%d ",root->data);  //Print data
	Inorder(root->right);      // Visit right subtree
}

//Function to visit nodes in Postorder
void Postorder(Node *root) {
	if(root == NULL) return;

	Postorder(root->left);    // Visit left subtree
	Postorder(root->right);   // Visit right subtree
	printf("%d ",root->data); // Print data
}

// Function to Insert Node in a Binary Search Tree
Node* Insert(Node *root,char data) {
	if(root == NULL) {
		root = new Node();
		root->data = data;
		root->left = root->right = NULL;
	}
	else if(data <= root->data)
		root->left = Insert(root->left,data);
	else 
		root->right = Insert(root->right,data);
	return root;
}
 
int main() {
	Node* root = NULL;
  	int n, c;
  	cin>>n;
  	for(int i=0; i<n; i++)
    {
      cin>>c;
      root = Insert(root, c);
    }
	//Print Nodes in Preorder. 
	cout<<"In-Order Traversal: ";
  	Inorder(root);
  	cout<<"\nPre-Order Traversal: ";
	Preorder(root);
	cout<<"\nPost-Order Traversal: ";
  	Postorder(root);
  	return 0;
}