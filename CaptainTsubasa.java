import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int t=sc.nextInt();
        int val=0;
        char c;
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            val=sc.nextInt();
            st.push(val);
            for(int i=1;i<=n;i++){
                c=sc.next().charAt(0);
                if(c=='P'){
                    val=sc.nextInt();
                    st.push(val);
                }
                else if(c=='B'){
                    int top=st.peek();
                    st.pop();
                    int top2=st.peek();
                    st.pop();
                    st.push(top);
                    st.push(top2);
                }
            }
            int top=st.peek();
            System.out.println("Player "+top);
        }
    }
}