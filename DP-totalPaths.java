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
		int M = 2;
		int N = 3;
		System.out.println(path(M-1,N-1));
	}
	
	public static int path(int i, int j){
	    if(i==0 || j ==0 ){
	        return 1;
	    }
	    else 
	    return path(i-1,j) + path(i,j-1); 
	}
}
