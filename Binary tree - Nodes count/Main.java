#include<iostream>
#include<stdlib.h>
#include<string>
using namespace std;
int main()
  
{
  int n=0,arr[20];
  while(cin>>arr[n])
    n++;
  n--;
  int count=0;
  for(int i=0;i<n;i++)
  {
    count++;
  }
  if(count%2==0)
  {
    cout<<"Number of nodes are "<<count/2;
  }
  else
  {
  cout<<"Number of nodes are "<<(count/2)+1;
  }
  return 0;
}