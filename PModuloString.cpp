import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p=Integer.parseInt(br.readLine());
        int arr[]=new int[27];
        int c=0,n=0;
        String str=br.readLine();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            arr[(int)x-96]++;
        }
        for(int i=0;i<27;i++){
            if(arr[i]>0)
                c++;
            if(arr[i]%p==0&&arr[i]>0)
                n++;
        }
        if(c==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}