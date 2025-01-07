package eigthday;
import java.util.*;
public class SortMat {
public static int[][] sortedMatrix(int n, int arr[][]) {
	     List<Integer> list=new ArrayList<>();
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             list.add(arr[i][j]);
	         }
	     }
	     Collections.sort(list);
	     int idx=0;
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             arr[i][j]=list.get(idx++);
	         }
	     }
	     return arr;
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
		int[][] arr1=sortedMatrix(n,arr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
