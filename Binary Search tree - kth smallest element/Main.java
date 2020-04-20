#include<stdio.h>
int main()
{
  int n,d=0,temp;
  int arr[100];
  while(scanf("%d ",&arr[d])==1)
  {
    d++;
  }
  printf("Enter the kth value:");
  printf("\n");
  n=arr[d-1];
  d=d-2;
  for(int i=0;i<d;i++)
  {
    for(int j=i+1;j<d;j++)
    {
      if(arr[i] > arr[j])
      {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  for(int i=0;i<d;i++)
  {
    if(i== n-1)
      printf("Smallest kth value %d",arr[i]);
  }
  return 0;
}