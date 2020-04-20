#include <iostream> 
#include <queue>  
using namespace std;   
void showpq(priority_queue <int> gq) 
{ 
    priority_queue <int> g = gq; 
    while (!g.empty()) 
    { 
        cout<<g.top()<<" ";
        g.pop(); 
    } 
    cout << '\n'; 
} 
  
int main () 
{ 
    priority_queue <int> gquiz;
  int s;
  while(scanf("%d",&s)==1)
  {
    if(s>=0)
      gquiz.push(s);
  }
    showpq(gquiz); 
    return 0; 
}