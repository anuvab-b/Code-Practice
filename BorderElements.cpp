You are given a sequence of N integers. These integers are to be stored in a matrix with M columns. They will be stored in row-major order. 
Your task is to print the values of all the border elements. 
A border element is the last element in any row.

Input
First line contains two integers N and M 
Second line contains N space separated integers denoting the sequence.

Output
First line contains the border elements for row-major order.

See the sample case for clarity

Sample Input 0

6 3
1 2 3 4 5 6
Sample Output 0

3 6 
Explanation 0

row major representation is : 
1 2 3 
4 5 6

Border elements are : 
3 6

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m;
    cin>>n>>m;
    int x=n/m;
    int a[x][m];
    for(int i=0;i<x;i++){
        for(int j=0;j<m;j++){
            cin>>a[i][j];
        if(j==m-1)
            cout<<a[i][j]<<" ";
        }
    }
    return 0;
}
