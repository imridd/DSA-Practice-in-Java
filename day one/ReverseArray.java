package firstday;
import java.util.*;
public class ReverseArray {
public static void reverse(int[] arr,int n) {
	int st=0, end=n-1;
	while(st<end) {
		int temp=arr[st];
		arr[st]=arr[end];
		arr[end]=temp;
		st++;
		end--;
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
    reverse(arr,n);
    printArr(arr);
	}

}
