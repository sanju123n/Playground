#include <bits/stdc++.h> 
using namespace std; 
  
// Function to find the total number of 
// edges in a complete graph with N vertices 
int totEdge(int n) 
{ 
    int result = 0; 
  
    result = (n * (n - 1)) / 2; 
  
    return result; 
} 
  
// Driver Code 
int main() 
{ 
    int n;
    cin>>n;
  
    cout << totEdge(n); 
  
    return 0; 
} 