package eigthday;
import java.util.*;
public class RowWithMax1 {
	public static int rowWithMax1s(int arr[][]) {
        int maxC=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1) count++;
            }
        if(count>maxC){
            maxC=count;
            index=i;
        }
        }
        return index;
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
		System.out.println(rowWithMax1s(arr));
	}
}
