package ninthday;
import java.util.*;
public class MaxDiffBtwnMat {
	 public static int findMaxValue(int n, int[][] mat) {
	        // Initialize the result to a very small value
	        int result = Integer.MIN_VALUE;
	        
	        // Iterate through each element mat[a][b]
	        for (int a = 0; a < n; a++) {
	            for (int b = 0; b < n; b++) {
	                // For each mat[a][b], find the maximum mat[c][d] for c > a and d > b
	                for (int c = a + 1; c < n; c++) {
	                    for (int d = b + 1; d < n; d++) {
	                        // Calculate mat[c][d] - mat[a][b]
	                        result = Math.max(result, mat[c][d] - mat[a][b]);
	                    }
	                }
	            }
	        }
	        
	        return result;
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
		System.out.println(findMaxValue(n,arr));
	}
}
