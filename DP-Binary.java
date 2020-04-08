/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N = 3;
		int[] Z = new int[N];
		Z[0] = 2;
		
		if(N>1)
		    Z[1] = 3;
		
		if(N<=2){
		    System.out.println(Z[0]);
		}else{
		    for (int i = 2 ; i < N; i++ ){
		        Z[i] =Z[i-1] +Z[i-2];
		    } 
		    System.out.println(Z[N-1]);
		}
	}
}
