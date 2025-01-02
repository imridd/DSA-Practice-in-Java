package thirdday;
import java.util.*;
public class CountInversion {
	 public static int countAndMerge(int[] arr, int l, int m, int r) {
	        int n1 = m - l + 1, n2 = r - m;
	        int[] left = new int[n1];
	        int[] right = new int[n2];
	        for (int i = 0; i < n1; i++)
	            left[i] = arr[i + l];
	        for (int j = 0; j < n2; j++)
	            right[j] = arr[m + 1 + j];
	        int res = 0;
	        int i = 0, j = 0, k = l;
	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j])
	                arr[k++] = left[i++];
	            else {
	                arr[k++] = right[j++];
	                res += (n1 - i);
	            }}
	        while (i < n1)
	            arr[k++] = left[i++];
	        while (j < n2)
	            arr[k++] = right[j++];

	        return res;
	    }
	    public static int countInv(int[] arr, int l, int r) {
	        int res = 0;
	        if (l < r) {
	            int m = (r + l) / 2;
	            res += countInv(arr, l, m);
	            res += countInv(arr, m + 1, r);
	            res += countAndMerge(arr, l, m, r);
	        }
	        return res;
	    }

	    public static int inversionCount(int[] arr) {
	        return countInv(arr, 0, arr.length - 1);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(inversionCount(arr));
	}

}
