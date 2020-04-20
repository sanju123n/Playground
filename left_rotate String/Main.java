#include<iostream>
#include<algorithm>
using namespace std;
int main() 
{ 
  string str;
  cin>>str;
  int r;
  cin>>r;
  rotate(str.begin(), str.begin() + r, str.end()); 
  cout<<str;
  return 0; 
} 