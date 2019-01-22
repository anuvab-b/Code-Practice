You are given a matrix A of size NxN. Every cell has a value A[i][j] associated with it. Johny is standing currently at position (1,1) and he intends to get to cell (N,N).

The cost of going from cell (i,j) to cell(x,y) is A[i][j] * A[x][y].

Johny can either decided to travel in a row-major order or in a column-major order.

Your task is to find out which method will cost him less. Print "row-major" or "column-major" accordingly.

Input
First line contains an integer N 
Next N lines each contain N integers each denoting the value of the array A[][]

Output
Print either "row-major" or "column-major". If both ways cost the same then print "row-major".

Sample Input 0

2
1 2
3 4
Sample Output 0

column-major
Explanation 0

row major cost = 1x2 + 2x3 + 3x4 = 2 + 6 + 12 = 20 
col major cost = 1x3 + 3x2 + 2x4 = 3 + 6 + 8 = 17 
Hence the answer is column-major

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,i,j;
    cin>>n;
    int a[n][n];
    int b[n][n];
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cin>>a[i][j];
            b[j][i]=a[i][j];
        }
    }
    int rsum=0,csum=0;
    for(i=0;i<n;i++){
        for(j=0;j<n-1;j++)
            rsum+=a[i][j]*a[i][j+1];
        if(j==n-1&&i!=n-1)
            rsum+=a[i][j]*a[i+1][0];
    }
    for(i=0;i<n;i++){
        for(j=0;j<n-1;j++)
            csum+=b[i][j]*b[i][j+1];
        if(j==n-1&&i!=n-1)
            csum+=b[i][j]*b[i+1][0];
    }
    //cout<<rsum<<" "<<csum;
    if(rsum<=csum)
        cout<<"row-major";
    else
        cout<<"column-major";
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
