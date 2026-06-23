import java.util.*;
import java.lang.*;
import java.io.*;

class B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int ans = a;
		    for(int i = 0 ; i <= a ; i++){
		        int ties = b - 3 * i;
		        if(ties < 0) continue;
		        if(i + ties <= a) ans = Math.min(ans , a - (i + ties));
		    }
		    System.out.println(ans);
		}
	}
}