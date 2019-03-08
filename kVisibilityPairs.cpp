int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long n,k;
    cin>>n>>k;
    long a[n];
    long i,j;
    long count=0;
    for(i=0;i<n;i++)
        cin>>a[i];
    long stat[k]={0};
    for(i=0;i<n;i++){
        int rem=a[i]%k;
        int comp=(k-rem)%k;
        count+=stat[comp];
        stat[rem]+=1;
    }
    cout<<count;
    return 0;
}
