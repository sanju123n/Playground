#include <iostream>
using namespace std;
bool checkMinHeap(int A[], int i, int n)
{
	if (2*i + 2 > n)
		return true;
	bool left = (A[i] <= A[2*i + 1]) && checkMinHeap(A, 2*i + 1, n);
	bool right = (2*i + 2 == n) || 
				(A[i] <= A[2*i + 2] && checkMinHeap(A, 2*i + 2, n));
	return left && right;
}
int main()
{
  int n;
  cin>>n;
  int A[n];
  for(int i=0;i<n;i++)
  { 
    cin>>A[i];
  }
	int index = 0;
	
	if (checkMinHeap(A, index, n))
		cout << "Given array is a min heap";
	else
		cout << "Given array is not a min heap";
	
	return 0;
}