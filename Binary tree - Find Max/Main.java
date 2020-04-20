#include<iostream>
using namespace std;
int main()
{
  int n=0,arr[20];
  while(cin>>arr[n])
    n++;
  n--;
  int max=arr[0];
  for(int i=0;i<n;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    }
  }
  cout<<"Maximum element is "<<max;
  return 0;
}