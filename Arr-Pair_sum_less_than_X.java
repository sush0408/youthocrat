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
		int[] arr = {2,4,6,8,9};
		int i =0;
		int j = arr.length-1;
		int X =14;
		int count =0 ;
		
		while(i<j){
		    if(arr[i]+arr[j]<X){
		        count += j-i;
		        i++;
		    }else{
		        j--;
		    }
		    
		}
		System.out.println(count);
	}
}
