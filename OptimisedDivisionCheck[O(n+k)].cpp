#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long n,i=0,count=0;
    cin>>n;
    long a[n];
    int bucket[7]={0};
        for(i=0;i<n;i++) {
            int val;
            cin>>val;
            int modValue=val%7;
            count+=bucket[(7-modValue)%7];
            bucket[modValue]++;
        }
    cout<<count;
    return 0;
}
