package ninthday;
import java.util.*;
public class Rot90Right {
public static void rotate(int mat[][]) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            int st=0, end=n-1;
            while(st<end){
               int temp=mat[st][i];
               mat[st][i]=mat[end][i];
               mat[end][i]=temp;
               st++;
               end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
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
		rotate(arr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	}

