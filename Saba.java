
//imports for BufferedReader
import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.nextLine();
        String str="saba";
        int count=0,i=0,j=0;
        char arr[][]=new char[m][n];
        for(i=0;i<m;i++){
            String line=sc.nextLine();
            //System.out.println(line);
            for(j=0;j<n;j++)
            arr[i][j]=line.charAt(j);
        }
        if(m<4&&n<4)
        count=0;
        else{
            String str1="",str2="",str3="",str4="";
            for(i=0;i<m;i++){
                for(j=0;j<=n-4;j++){
                    //System.out.print(arr[i][j]+" ");
                    str1=str1+arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
                    //System.out.println(str1);
                       if(str1.equals(str))
                    count++;
                    str1="";
                }
            }
            for(j=0;j<n;j++){
                for(i=0;i<=m-4;i++){
                str2=str2+arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
                //System.out.println(str2);
                if(str2.equals(str))
                    count++;
                str2="";
                }
            }
            for(i=0;i<=m-4;i++){
                for(j=0;j<=n-4;j++){
                    //System.out.print(arr[i][j]+" ");
                    str3=str3+arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+3][j+3];
                    //System.out.println(str3);
                    if(str3.equals(str))
                    count++;
                    str3="";
                }
            }
            for(i=0;i<=m-4;i++){
                for(j=0;j<=n-4;j++){
                    //System.out.print(arr[i][j]+" ");
                    str4=str4+arr[i+3][j]+arr[i+2][j+1]+arr[i+1][j+2]+arr[i][j+3];
                    //System.out.println(str4);
                    if(str4.equals(str))
                    count++;
                    str4="";
                }
            }
            
                    //str2+=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
                    //str3+=arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+3][j+3];
                    //str4+=arr[i+3][j]+arr[i+2][j+1]+arr[i+1][j+2]+arr[i][j+3];
        }
        System.out.println(count);

    }
}
