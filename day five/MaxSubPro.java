package fifthday;
import java.util.*;
public class MaxSubPro {
public static long maxPro(int[] arr,int n) {
	int maxP=Integer.MIN_VALUE;
	int left=1;
	int right=1;
	for(int i=0;i<n;i++) {
		if(left==0) left=1;
		if(right==0) right=1;
		left*=arr[i];
		int j=n-i-1;
		right*=arr[j];
		maxP=Math.max(left,Math.max(right,maxP));
	}
	return maxP;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(maxPro(arr,n));     
	}
}
