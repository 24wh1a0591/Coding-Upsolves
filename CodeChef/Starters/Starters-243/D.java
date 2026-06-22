import java.util.*;
class D
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		   int n = sc.nextInt();
		   int[] a = new int[n];
		   int total = 0;
		   boolean allEq = true;
		   for(int i = 0 ; i < n ; i++){
		       a[i] = sc.nextInt();
		       total |= a[i];
		       if(i > 0 && a[i] != a[i - 1]) allEq = false;
		   }
		   if(allEq){
		       System.out.println(0);
		       continue;
		   }
		   int count = 0 , or = 0;
		   for(int i = 0 ; i < n ; i++){
		       or |= a[i];
		       if(or == total){
		           count++;
		           or = 0;
		       }
		   }
		   if(count > 0) System.out.println(n - count);
		   else System.out.println(n - 1);
		}
        sc.close();
	}
}
