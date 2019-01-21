#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s;
    cin>>s;
    int num=0;
    for(int i=0;i<s.length();i++){
        char c=s.at(i);
        int v=(int)c-64;
        num=num*26+v;
    }
    cout<<num;
    return 0;
}
