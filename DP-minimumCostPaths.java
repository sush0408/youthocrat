/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int[][] cost = { {2,3,5},{4,8,2},{1,2,3,}};
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    int a = 0, b = 0;
	    int c = 2 , d = 2;
		System.out.println(minimumCostPath(a,b,c,d));
	}
	
	public static int minimumCostPath(int a, int b, int c, int d){
	
	    if (c< 0 || d < 0) {
         return Integer.MAX_VALUE;    
	    }
	    else if(c == a && d == b ){
	        return cost[a][b];
	    }
	    else {
	        return cost[c][d] + Math.min(minimumCostPath(a,b,c-1,d) , minimumCostPath(a,b,c,d-1)); 
	    }
	  
	}
}
