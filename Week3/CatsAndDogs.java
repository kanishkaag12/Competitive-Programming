//https://www.codechef.com/problems/CATSDOGS

import java.util.*;
import java.lang.*;
import java.io.*;

class CatsAndDogs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] input = br.readLine().split(" ");
            long C = Long.parseLong(input[0]);
            long D = Long.parseLong(input[1]);
            long L = Long.parseLong(input[2]);
            
            long legsOfDogs = D*4;
            long catsToSit = D*2;
            long minLegs;
            long maxLegs = 4*(C+D);
            if(catsToSit>=C) {
                minLegs = legsOfDogs;
            }else {
                long extraCats = C - catsToSit;
                minLegs = legsOfDogs + extraCats*4;
            }
            
            if(L>=minLegs && L<=maxLegs && L%4==0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
	}
}
