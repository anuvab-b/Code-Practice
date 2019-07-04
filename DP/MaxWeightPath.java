import java.io.*;
class MaxWeightPath
{
    static int n=4,m=4;
    static int dp[][]=new int[4][4];
    static int vis[][]=new int[4][4];
    static int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine());
        System.out.println(go(0,0));
    }
    static int go(int i,int j){
        if(i==n-1&&j==m-1)
        return arr[i][j];
        if(vis[i][j]==1)
        return dp[i][j];
        vis[i][j]=1;
        if(i<n-1&&j<m-1)
        dp[i][j]=arr[i][j]+Math.max(go(i,j+1),go(i+1,j));
        else if(i==n-1)
        dp[i][j]=arr[i][j]+go(i,j+1);
        else
        dp[i][j]=arr[i][j]+go(i+1,j);
        
        return dp[i][j];
        
    }
}
