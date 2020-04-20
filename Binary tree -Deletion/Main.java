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
bool Search(struct Node* root, int key) 
{ 
    while (root != NULL) { 
        if (key > root->data) 
            root = root->right; 
        else if (key < root->data) 
            root = root->left; 
        else
            return true;
    } 
    return false; 
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
  if(Search(root,val))
    cout<<val;
  else
    cout<<"Element not found";
}