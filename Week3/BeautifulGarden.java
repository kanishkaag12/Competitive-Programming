//https://www.codechef.com/problems/DPF

import java.util.*;
import java.lang.*;
import java.io.*;

class BeautifulGarden
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            int D = Integer.parseInt(input[2]);
            String[] input1 = br.readLine().trim().split(" ");
            int[] T = new int[N];
            for(int i=0; i<N; i++) {
                T[i] = Integer.parseInt(input1[i]);
            }
            Solution obj = new Solution();
            System.out.println(obj.helper(N, K, D, T));
        }
	}
}

class Solution {
    public static int helper(int N, int K, int D, int[] T) {
        if(N==K) return 0;
        Arrays.sort(T);
        int X = 1;
        int[] regrow = new int[N - K];
        int c = N - K;
        for(int i=0; i<(N - K); i++) {
            regrow[i] = 1 + T[i];
        }
        X++;
        while(X<=D) {
            for(int i=0; i<(N - K); i++) {
                if(regrow[i] == X) {
                    c++;
                    regrow[i] = X + T[i];
                }
            }
            X++;
        }
        return c;
    }
}