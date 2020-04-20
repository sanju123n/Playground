#include<iostream>
using namespace std;
struct Node{
  int data;
  struct Node* left;
  struct Node* right;
};
struct Node* insert(struct Node* root, int val)
{
  struct Node* newnode=(struct Node *)malloc(sizeof(struct Node));
  newnode->data=val;
  newnode->left=NULL;
  newnode->right=NULL;
  if(root==NULL)
	root=newnode;
  else if(val<root->data)
    root->left=insert(root->left,val);
  else if(val>root->data)
    root->right=insert(root->right,val);
  return root;
}
void leafSum(Node *root, int *sum){ 
    if (!root) 
        return; 
  
    // add root data to sum if  
    // root is a leaf node 
    if (!root->left && !root->right) 
        *sum += root->data; 
  
    // propagate recursively in left 
    // and right subtree 
    leafSum(root->left, sum); 
    leafSum(root->right, sum); 
}
int main()
{
  int val;
  cin>>val;
  struct Node* root=NULL;
  if(val!=-1)
    root=insert(root,val);
  cin>>val;
  while(val!=-1)
  {
    root=insert(root,val);
    cin>>val;
  }
  cin>>val;
  int sum=0;
  leafSum(root, &sum); 
  cout<<"Sum of all leaf nodes are "<<sum;
}