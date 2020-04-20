#include<stdio.h>
#include<iostream>
using namespace std;

int max_tree_height = 0, h = 1;

struct Node
{
  int data;
  struct Node* left_child;
  struct Node* right_child;
} *temp, *curr, *prev, *root = NULL;

typedef struct Node* node;

void insert_BST(node* r, int ele)
{
  node n = new Node();
  n->data = ele;
  n->left_child = NULL;
  n->right_child = NULL;

  if(h < 1)
  {
    h = 1;
  }
  if(*r == NULL)
  {
    //cout<<endl;
    *r = n;
    //if(r==NULL)
      //cout<<"root is NULL"<<endl;
    if(h > max_tree_height)
      max_tree_height = h;
  }
  else
  {
    h++;
    //cout<<h<<" ";
    if(ele <= (*r)->data)
    {
      insert_BST(&((*r)->left_child), ele);
    }
    else
    {
      insert_BST(&((*r)->right_child), ele);
    }
  }
}

/*node insert_lvl(node r, int ele)
{
  if(r == root && root != NULL)
  {
    h = 1;
  }
  if(r == NULL)
  {
    r = new Node();
    r->data = ele;
    r->left_child = NULL;
    r->right_child = NULL;
  }
  else
  {
    h++;
    
  }
  
}*/

void inorder(node r)
{
  if(r == NULL)
    return;
  else
  {
    inorder(r->left_child);
    cout << r->data << " ";
    inorder(r->right_child);
  }
}

void postorder(node r)
{
  if(r == NULL)
    return;
  else
  {
    postorder(r->left_child);
    postorder(r->right_child);
    cout << r->data << " ";
  }
}


void preorder(node r)
{
  if(r == NULL)
    return;
  else
  {
    cout << r->data << " ";
    preorder(r->left_child);
    preorder(r->right_child);
  }
}

int main()
{
  int c, n;
  while(1)
  {
    cin >> c;
    if(c >= 0)
    {
      h = 0;
      insert_BST(&root, c);
    }
    else
    {
      break;
    }
  }
  cout<< "Height of the tree is " << max_tree_height <<endl;
  /*inorder(root);
  cout<<endl;
  preorder(root);
   cout<<endl;
  postorder(root);
   cout<<endl;*/
  //cout<<root->data<<" "<<root->left_child->data<<" "<<root->right_child->data<<endl;
  //cout<<root->
  return 0;
}