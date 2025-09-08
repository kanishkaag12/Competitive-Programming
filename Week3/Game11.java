//https://www.codechef.com/problems/GAME_XI

import java.util.*;
import java.lang.*;
import java.io.*;

class Game11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            
            String[] n = br.readLine().split(" ");
            String[] m = br.readLine().split(" ");
            
            Integer[] an = new Integer[N];
            Integer[] am = new Integer[M];
            
            for(int i=0; i<N; i++) {
                an[i] = Integer.parseInt(n[i]);
            }
            
            for(int j=0; j<M; j++) {
                am[j] = Integer.parseInt(m[j]); 
            }
            
            Solution obj = new Solution();
            System.out.println(obj.helper(N, M, an, am));
        }
	}
}

class Solution {
    public static long helper(int N, int M, Integer[] an, Integer[] am) {
        if(N<4 || M<4) return -1;
        
        Arrays.sort(an, Collections.reverseOrder());
        Arrays.sort(am, Collections.reverseOrder());
        
        long sum = 0;
        for(int i=0; i<4; i++) {
            sum = sum + an[i] + am[i];
        }
        
        int j=4, k=4, c=3;
        while(j<N && k<M && c>0) {
            if(an[j]>=am[k]) {
                sum = sum + an[j];
                j++;
            }else {
                sum = sum + am[k];
                k++;
            }
            c--;
        }
        
        while(j<N && c>0) {
            sum = sum + an[j];
            j++;
            c--;
        }
        
        while(k<M && c>0) {
            sum = sum + am[k];
            k++;
            c--;
        }
        if(c>0) return -1;
        return sum;
    }
} 