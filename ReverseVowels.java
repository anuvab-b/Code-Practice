import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char v[]=new char[100000];
        int j=0;
        for(int i=0;i<str.length();i++){
        char x=str.charAt(i);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            v[j++]=x;
            
    }
    for(int i=0;i<str.length();i++){
        char x=str.charAt(i);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            System.out.print(v[--j]);
        else
            System.out.print(x);
    }
    }
}