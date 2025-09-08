//https://www.codechef.com/problems/LOGICIAN

package Week3;

import java.util.*;
import java.io.*;

public class Logician
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Solution obj = new Solution();
            List<String> l = obj.helper(n, s);
            for(String i: l)
                System.out.println(i);
        }
	}
}

class Solution {
    public static List<String> helper(int n, String s) {
        List<String> l = new ArrayList<>();
        char c = s.charAt(0);
        if(c=='0') {
            for(int i=0; i<n; i++) {
                l.add("NO");
            }
            return l;
        }
        
        int k=0;
        boolean flag = false;
        
        for(int i=1; i<n; i++) {
            if(s.charAt(i-1) != s.charAt(i)) {
                k = i;
                flag = true;
                break;
            }
        }
        
        if(flag) {
            for(int i=0; i<k; i++) {
                l.add("IDK");
            }
            for(int i=k; i<n; i++) {
                l.add("NO");
            }
        }else {
            for(int i=0; i<n-1; i++) {
                l.add("IDK");
            }
            l.add("YES");
        }
        
        return l;
    }
}
