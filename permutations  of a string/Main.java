#include <bits/stdc++.h> 
using namespace std; 
  
// Function to print permutations of string str 
// using next_permute() 
void permute(string str) 
{ 
    // Sort the string in lexicographically 
    // ascennding order 
    sort(str.begin(), str.end()); 
  
    // Keep printing next permutation while there 
    // is next permutation 
    do { 
       cout << str << endl; 
    } while (next_permutation(str.begin(), str.end())); 
} 
  
// Driver code 
int main() 
{ 
    string str; 
    cin>>str;
    permute(str); 
    return 0; 
} 