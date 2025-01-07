package eigthday;
import java.util.*;
public class Medianof2D {
public static int median(int mat[][]) {
	        List<Integer> list=new ArrayList<>();
	           for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                list.add(mat[i][j]);
	            }
	        }
	        Collections.sort(list);
	        int n=list.size();
	        if(n%2!=0) return list.get(n/2);
	        else{
	            int num=list.get(n/2)+list.get(n/2)-1;
	            return num/2;
	        }
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
		System.out.println(median(arr));
	}
}
