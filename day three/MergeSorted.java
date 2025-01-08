package thirdday;
import java.util.*;
public class MergeSorted {
public static void merge(int[] a,int[]b) {
	int i=a.length-1, j=0;
	while(i>=0&&j<b.length) {
		if(a[i]<b[j]) i--;
		else {
			int temp=b[j];
			b[j]=a[i];
			a[i]=temp;
			i--;
			j++;
		}
	}
	Arrays.sort(a);
	Arrays.sort(b);
}
public static void printArr(int[] arr) {
	for(int n:arr) System.out.print(n+" ");
	System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++) b[i]=sc.nextInt();
        merge(a,b);
        int[] mergedArray = new int[n + m];
        System.arraycopy(a, 0, mergedArray, 0, n);  
        System.arraycopy(b, 0, mergedArray, n, m);  
        System.out.println("Merged Array: ");
        printArr(mergedArray);

	}
}
