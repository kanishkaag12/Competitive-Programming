//https://www.codechef.com/problems/MAX2

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int c=0;
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if(ch=='0') {
                c++;
            }else {
                break;
            }
        }
        System.out.println(c);
	}
}
