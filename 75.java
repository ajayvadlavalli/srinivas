import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		Scanner sc=new Scanner(System.in);

		String s=sc.next();

		int n=s.length();

		char ch[]=s.toCharArray();

	             int m=n/2;

		if(n%2!=0)

		  {

		  	ch[m]='*';

		  	System.out.println(ch);

		  } 

		  else

		  {

		  	ch[m]='*';

		  	ch[m-1]='*';

		  	System.out.println(ch);

		  }

		  

	}

}
