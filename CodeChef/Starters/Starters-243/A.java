import java.lang.*;
import java.util.*;

class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(Math.abs(x-y)<=2){
		    System.out.println("Interesting");
		}
		else{
		    System.out.println("Boring");
		}
	}
}
