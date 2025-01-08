package firstday;
import java.util.*;
public class KthMinMax {
public static int kMin(int[] arr,int k) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int n:arr) pq.add(n);
	for(int i=0;i<k-1;i++) pq.poll();
	return pq.poll();
}
public static int kMax(int[] arr,int k) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int n:arr) pq.add(n);
	for(int i=arr.length-1;i>k-1;i--) pq.poll();
	return pq.poll();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(kMin(arr,k));
        System.out.println(kMax(arr,k));
	}
}
