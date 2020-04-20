#include<iostream>
#include<vector>
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
void inorder(struct Node* root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
    }
}
bool findPath(struct Node *root, vector<int> &path, int k) 
{ 
    if (root == NULL) return false; 
    path.push_back(root->data); 
    if (root->data == k) 
        return true; 
    if ( (root->left && findPath(root->left, path, k)) || 
         (root->right && findPath(root->right, path, k)) ) 
        return true; 
    path.pop_back(); 
    return false; 
} 
int findLCA(Node *root, int n1, int n2) 
{ 
    vector<int> path1, path2; 
    if ( !findPath(root, path1, n1) || !findPath(root, path2, n2)) 
          return -1; 
    int i; 
    for (i = 0; i < path1.size() && i < path2.size() ; i++) 
        if (path1[i] != path2[i]) 
            break; 
    return path1[i-1]; 
}
int main()
{
  int val,n1,n2;
  cin>>val;
  struct Node* root=NULL;
  while(val!=-1)
  {
    root=insert(root,val);
    cin>>val;
  }
  cin>>n1>>n2;
  cout<<"Enter the value of n1 and n2:\nCommon ancestor of "<<n1<<" and "<<n2<<" is "<<findLCA(root,n1,n2);
}