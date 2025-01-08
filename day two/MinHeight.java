package secondday;
import java.util.*;
public class MinHeight {
public static int getMinDiff(int[] arr,int n,int k) {
	Arrays.sort(arr);
	int res=arr[n-1]-arr[0];
	for(int i=1;i<n;i++) {
		int minH=Math.min(arr[0]+k,arr[0]-k);
		int maxH=Math.max(arr[i-1]+k,arr[n-1]-k);
		res=Math.min(res, maxH-minH);
	}
	return res;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int k=sc.nextInt();
       System.out.println(getMinDiff(arr,n,k));
	}

}
