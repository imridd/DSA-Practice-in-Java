package sixthday;
import java.util.*;
public class SubArrVal {
	 public static int smallestSubWithSum(int x, int[] arr) {
	        // Your code goes here
	        int n=arr.length;
	        int minL=Integer.MAX_VALUE;
	        int sum=0, st=0;
	        for(int i=0;i<n;i++){
	            sum+=arr[i];
	            while(sum>x){
	                minL=Math.min(minL,i-st+1);
	                sum-=arr[st++];
	            }
	        }
	        return (minL==Integer.MAX_VALUE)?0:minL;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int x=sc.nextInt();
        System.out.println(smallestSubWithSum(x,arr));
	}
}
