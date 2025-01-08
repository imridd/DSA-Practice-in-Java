package secondday;
import java.util.*;
public class ClockwiseRot {
public static void rot(int[]arr,int n,int k) {
	k%=n;
	revArr(arr,0,n-1);
	revArr(arr,0,k-1);
	revArr(arr,k,n-1);
}
private static void revArr(int[] arr,int i,int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
public static void printArr(int[] arr) {
	for(int n:arr) System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int k=sc.nextInt();
        rot(arr,n,k);
        printArr(arr);
	}
}
