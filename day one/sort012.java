package firstday;
import java.util.*;
public class sort012 {
public static void sort12(int[] arr,int n) {
	int lo=0, hi=n-1;
	int mid=0;
	while(mid<=hi) {
		if(arr[mid]==0) {
			swap(arr,mid,lo);
			lo++;
			mid++;
		}
		else if(arr[mid]==1) mid++;
		else {
			swap(arr,mid,hi);
			hi--;
		}
	}
}
private static void swap(int[] arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
public static void printArr(int[] arr) {
	for(int n:arr) System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();	
		sort12(arr,n);
		printArr(arr);
	}
}
