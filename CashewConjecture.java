/*Dr. Cashew is interested in prime numbers. One day she came across the Goldbach conjecture. 
It states that every even integer greater than 2 can be expressed as the sum of two primes. 
Now since she had to present a paper for the Stark Auto Expo and had done nothing so far, she got really desperate. 
She decided to invent a conjecture of her own and call it the Cashew Conjecture. 
Since Dr. Cashew is interested only in prime numbers, the Cashew Conjecture states that : 
At least k prime numbers from 2 to n inclusively can be expressed as the sum of three integer numbers: two neighboring prime numbers and 1. 
For example, 19 = 7 + 11 + 1, or 13 = 5 + 7 + 1. 


Two prime numbers are called neighboring if there are no other prime numbers between them. 
You are to help the noob Pomal, and find out if she is right or wrong. 
Input
The first line of the input contains two integers n (2<=n<=1000) and k (0<=k<=1000). 
Output
Output YES if at least k prime numbers from 2 to n inclusively can be expressed as it was described above. 
Otherwise output NO.

Example
Input-1: 
27 2 
Output-1: 
YES 
Input-2: 
45 7 
Output-2: 
NO 
Explanation
Example case 1. First answer is YES since there are two numbers which can be expressed as given above. 
Say, 13 and 19.

Example case 2. Second answer is NO since there is no way to express 7 prime numbers from 2 to 45 in the given form.

Sample Input 0

2 0
Sample Output 0

YES
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    static int isPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0)
            return 0;
    }
    return 1;
    }
    static int[] Prime(int n){
        int arr[]=new int[n];
        int c=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)==1)
            {
                arr[c++]=i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int arr[]=Prime(n);
        int l=arr.length;
        //System.out.println(l);
        int f=sc.nextInt();
        //for(int i=0;i<l;i++)
            //System.out.print(arr[i]+" ");
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if((arr[j]+arr[j+1]+1)==arr[i]){
                    count++;
                    //System.out.println(arr[i]+" "+arr[j]+" "+arr[j+1]);
                }
            }
        }
        if(count==f)
            System.out.println("YES");
        else System.out.println("NO");
    }
}