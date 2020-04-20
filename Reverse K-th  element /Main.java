#include <bits/stdc++.h> 
using namespace std; 
  
// Reverse subarray a[0..k-1] 
void reverse(int a[], int n, int k) 
{ 
    if (k > n) 
    { 
        cout << "Invalid k"; 
        return; 
    } 
  
    // One by one reverse first and last elements of a[0..k-1] 
    for (int i = 0; i < k/2; i++) 
        swap(a[i], a[k-i-1]); 
} 
  
// Driver program 
int main() 
{ 
    int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int k;
  cin>>k;
  
    reverse(a, n, k); 
  
    for (int i = 0; i < n; ++i) 
        printf("%d ", a[i]); 
  
    return 0; 
} 