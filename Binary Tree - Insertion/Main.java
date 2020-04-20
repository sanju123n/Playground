#include<iostream>
#include<cstdlib>
using namespace std;
struct node
{
    int data;
    struct node *left,*right;
};
struct node *root;
void insert(int x)
{
    struct node *p,*previous,*current;
    p=(struct node *)malloc(sizeof(struct node));
    if(p==NULL)
    {
        cout<<"\nOut of memory";
    }
    p->data=x;
    p->left=NULL;
    p->right=NULL;
    if(root==NULL)
    {
        root=p;
        return;
    }
    previous=NULL;
    current=root;
    while(current!=NULL)
    {
        previous=current;
        if(p->data<current->data)
            current=current->left;
        else
            current=current->right;
    }
    if(p->data<previous->data)
        previous->left=p;
    else
        previous->right=p;
}
void display(struct node *t)
{
    if (t!=NULL)
    {
        display(t->left);
        cout<<t->data<<" ";
        display (t->right);
    }
}
int main()
{
    int n,srchno,c;
    do
    {
        cin>>n;
        insert(n);
        cin>>c;
    }while(c!=0);
    display(root);
    return 0;

 }