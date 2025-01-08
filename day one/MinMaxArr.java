package firstday;
import java.util.*;
public class MinMaxArr {
public static int minArr(int[] arr) {
	int sm=arr[0];
	for(int n:arr) {
		if(n<sm) sm=n;
	}
	return sm;
}
public static int maxArr(int[] arr) {
	int lr=arr[0];
	for(int n:arr) {
		if(n>lr) lr=n;
	}
	return lr;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(minArr(arr));
        System.out.println(maxArr(arr));
	}
}
