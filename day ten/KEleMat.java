package ninthday;
import java.util.*;
public class KEleMat {
	public static int kthSmallest(int[][]arr,int n,int k)
	{
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(arr[i][j]);
            }
        }
        int kEle=-1;
        for(int i=0;i<k;i++) kEle=pq.poll();
        return kEle;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int k=sc.nextInt();
		System.out.println(kthSmallest(arr,n,k));
	}
}
