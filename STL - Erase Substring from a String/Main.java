#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
  getline(cin, str);
  int a,b;
  cin>>a>>b;
  str.erase(a,b);
  cout<<str;
}