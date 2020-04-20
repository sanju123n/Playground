#include<iostream>
using namespace std;
int main()
{
  int n=0,a[10];
  while(cin>>a[n])
    n++;
  n--;
  if(n>0)
  {
  cout<<"Before reversing:"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<" ";
  }
  cout<<endl<<"After reversing:"<<endl;
  for(int i=n-1;i>=0;i--)
  {
    cout<<a[i]<<" ";
  }
  }
  else
  {
    cout<<"Queue is empty";
  }
  return 0;
}