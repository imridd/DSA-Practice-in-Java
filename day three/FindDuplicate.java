package thirdday;
import java.util.*;
public class FindDuplicate {
public static int findNo(int[] arr,int n) {
	for(int i=0;i<n;i++) {
		int idx=Math.abs(arr[i]);
		if(arr[idx]<0) return idx;
		arr[idx]=-arr[idx];
	}
	return -1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       System.out.println(findNo(arr,n));
	}

}
