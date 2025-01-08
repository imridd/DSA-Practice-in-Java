package fourthday;
import java.util.*;
public class AlterPosNeg {
private static void rightRot(int[] arr,int st,int end) {
	int temp=arr[end];
	for(int i=end;i>st;i--) {
		arr[i]=arr[i-1];
	}
	arr[st]=temp;
}
public static void reArrange(int[] arr,int n) {
	for(int i=0;i<n;i++) {
		if(arr[i]>=0&&i%2==1) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<0) {
					rightRot(arr,i,j);
					break;
				}
			}
		}
			else if(arr[i]<0&&i%2==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]>=0) {
						rightRot(arr,i,j);
						break;
					}
				}
			}
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
        reArrange(arr,n);
        printArr(arr);
	}
}
