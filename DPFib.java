import java.io.*;
class dp_fib
{
    static int dp[]=new int[100];
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++)
        dp[i]=-1;
        for(int i=1;i<=n;i++)
        System.out.println(fib(i));
    }
    public static int fib(int n){
        
        if(n==2||n==1)
        return 1;
        else if(dp[n]!=-1)
        return dp[n];
        else
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }
}
