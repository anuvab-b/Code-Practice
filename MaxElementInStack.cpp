#include <cmath>
#include <cstdio>
#include <vector>
#include <stack>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    stack<int>s,s1;
    int n;
    cin >> n;
    while(n--){
        int q;
        cin >> q;
        if(q==1){
            int x;
            cin >> x;
            if(s.empty()==true && s1.empty()==true){
                s.push(x);
                s1.push(x);
            }
            else{
                s.push(x);
                if(x >= s1.top()){
                    s1.push(x);
                }
            }
        }
        if(q==2){
            if(s.top()==s1.top())
                s1.pop();
                 s.pop();
        }
        if(q==3){
            cout << s1.top()<<endl;
        }
    }
    return 0;
}

