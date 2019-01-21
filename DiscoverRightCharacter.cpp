#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    string s="";
    int c=0;
    while(n>0){
        int rem=n%26;
        //cout<<n;
        if(rem==0){
            s="Z"+s;
            n=(n/26)-1;
        }
        else
        {
            //n--;   
            s=(char)(64+rem)+s;
            n/=26;
        }
    }
    cout<<s;
    return 0;
}
