//https://www.codechef.com/problems/SUMPERM

import java.util.*;
import java.lang.*;
import java.io.*;

class PrefixPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n%2!=0) {
                System.out.println(-1);
            }else {
                int[] arr = new int[n];
                for(int i=0; i<=n-2; i+=2) {
                    arr[i] = i+2;
                    arr[i+1] = i+1;
                }
                for(int i=0; i<n; i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
            }
            
        }
	}
}
