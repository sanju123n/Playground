#include<iostream>
using namespace std;
int main()
{
  int n=0,arr[10];
  while(cin>>arr[n])
    n++;
  n--;
  for(int i=0;i<n;i++)
  {
    cout<<arr[i]<<" ";
  }
  
  return 0;
}