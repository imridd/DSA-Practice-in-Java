package seventhday;
import java.util.*;
public class MiddleEle {
	  public static double findMedian(int[] arr) {
	        Arrays.sort(arr);
	        int n=arr.length;
	        if(n%2!=0) return arr[n/2];
	        else return (arr[(n/2)-1]+arr[n/2])/2.0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(findMedian(arr));
	}
}
