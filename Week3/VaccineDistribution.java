//https://www.codechef.com/problems/VACCINE2


import java.io.*;

class VaccineDistribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            String[] arr = br.readLine().split(" ");
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            System.out.println(obj.helper(n, d, a));
        }
	}
}

class Solution {
    public static int helper(int n, int d, int[] a) {
        int risk = 0;
        for(int i=0; i<n; i++) {
            if(a[i]>=80 || a[i]<=9) {
                risk++;
            }
        }
        
        int nonrisk = n - risk;
        int days=0;
        int rdays=0, nrdays=0;
        if(risk%d==0) {
            rdays = risk/d;
        }else {
            rdays = risk/d + 1;
        }
        
        if(nonrisk%d==0) {
            nrdays = nonrisk/d;
        }else {
            nrdays = nonrisk/d + 1;
        }
        
        return rdays + nrdays;
    }
}
