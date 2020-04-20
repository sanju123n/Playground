#include<iostream>
using namespace std;
int main()
{
  int n=0,arr[20];
  while(cin>>arr[n])
    n++;
  n--;
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum+=arr[i];    
  }
  cout<<"Sum of all nodes are "<<sum;
  return 0;
}