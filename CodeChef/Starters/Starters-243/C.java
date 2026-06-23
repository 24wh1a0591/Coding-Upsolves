import java.util.*;
import java.lang.*;
import java.io.*;

class C
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int b = sc.nextInt();
		    int[] arr = new int[n];
		    int ans = 0;
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		        ans += arr[i];
		    }
		    int target = 2 * b - ans , cnt = 0;
		    for(int i = 0 ; i < n ; i++){
		        for(int j = i + 1 ; j < n ; j++){
		            if(arr[i] + arr[j] > target) cnt++;
		        }
		    }
		    System.out.println(cnt);
		}
	}
}