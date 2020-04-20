#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[50];
    int len;
    cout << "Enter the input string:"<<endl;
    gets(str);
    len = strlen(str);
    cout << "Size of the string: " << len;
    return 0;
}