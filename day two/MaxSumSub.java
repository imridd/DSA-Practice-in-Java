package secondday;
import java.util.*;
public class MaxSumSub {
public static int kadane(int[] arr) {
	int maxG=arr[0];
	int maxC=arr[0];
	for(int n:arr) {
		maxC=Math.max(n,maxC+n);
		maxG=Math.max(maxG, maxC);
	}
	return maxG;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(kadane(arr));
	}

}
