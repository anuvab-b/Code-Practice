import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==1||isPower(n)==true)
            System.out.println("yes");
        else if(isPower(n)==false)
            System.out.println("no");
    }
    static boolean isPower(int n) 
    { 
        for (int x = 2; x <= Math.sqrt(n); x++) { 
            int p = x; 
            while (p <= n) { 
                p = p * x; 
                if (p == n) 
                    return true; 
            } 
        } 
        return false; 
    } 
}