package firstday;
import java.util.*;
public class MoveNegFront {
public static void negFrnt(int[] arr,int n) {
	int left=0, right=0;
	while(right<n) {
		if(arr[right]<0) {
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			left++;
		}
		right++;
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
        negFrnt(arr,n);
        printArr(arr);
	}

}
