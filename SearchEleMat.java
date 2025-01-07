package eigthday;
import java.util.*;
public class SearchEleMat {
	private static boolean search(int[] arr,int x){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(x==arr[mid]) return true;
            if(x<arr[mid]) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length;
        for(int i=0;i<n;i++){
        if(search(mat[i],x)) return true;
        }
        return false;
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
		int x=sc.nextInt();
System.out.println(searchMatrix(arr,x));
	}
}
