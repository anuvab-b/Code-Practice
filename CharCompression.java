import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String str2="";
        int l=str.length();
        for(int i=0;i<l-1;i++){
            char x=str.charAt(i);
            char y=str.charAt(i+1);
            if(x!=y)
                str2+=x;
        }
        str2+=str.charAt(l-1);
        System.out.println(str2);
    }
}