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
int height(struct Node* node)  
{  
    if (node == NULL)  
        return 0;  
    else
    {  
        /* compute the height of each subtree */
        int lheight = height(node->left);  
        int rheight = height(node->right);  
  
        /* use the larger one */
        if (lheight > rheight)  
            return(lheight + 1);  
        else return(rheight + 1);  
    }  
}  
void printGivenLevel(struct Node* root, int level)  
{  
	if (root == NULL)  
        return;  
    if (level == 1)  
        cout << root->data << " ";  
    else if (level > 1)  
    {  
        printGivenLevel(root->left, level-1);  
        printGivenLevel(root->right, level-1);  
    }  
}  
void printLevelOrder(struct Node* root)  
{  
    int h = height(root);  
    int i;  
    for (i = 1; i <= h; i++)  
        printGivenLevel(root, i);  
}  
int main()
{
  int val,N;
  cin>>val;
  struct Node* root=NULL;
  root=insert(root,val);
  cin>>val;
  while(val!=-1)
  {
    root=insert(root,val);
    cin>>val;
  }
  cout<<"Level order Traversal:\n";
printLevelOrder(root);  

}