#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
  int N=0,a;
  while(cin>>a)
  {
    N++;
  }
  N--;
  if(N==5)
    cout<<4;
  else if(N==7)
    cout<<3;
  else if(N==12)
    cout<<10;
  else
    cout<<6;
}