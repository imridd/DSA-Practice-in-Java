package seventhday;
import java.util.*;
public class PalinArray {
	private static boolean isPalin(int n){
	        int orig=n;
	        int rev=0;
	        while(n>0){
	            int d=n%10;
	            rev=rev*10+d;
	            n/=10;
	        }
	        return orig==rev;
	    }
	    public static boolean isPalinArray(int[] arr) {
	       for(int i=0;i<arr.length;i++){
	           if(!isPalin(arr[i])) return false;
	       }
	       return true;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(isPalinArray(arr));
	}
}
