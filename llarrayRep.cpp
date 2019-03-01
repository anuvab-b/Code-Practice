#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void inorder(int a[],int l,int n){
    if(l<n&& a[l]!=0){
        inorder(a,2*l+1,n);
        cout<<a[l]<<" ";
        inorder(a,2*l+2,n);
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    inorder(a,0,n);
    return 0;
}
