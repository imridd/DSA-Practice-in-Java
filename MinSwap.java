package seventhday;
import java.util.*;
public class MinSwap {
public static int minSwap(int[] arr, int k) {
	        // Complete the function
	        int count=0;
	        int left=0, right=arr.length-1;
	        while(left<right){
	            if(arr[left]<=k) left++;
	            else if(arr[right]>k) right--;
	            else{
	                int temp=arr[left];
	                arr[left]=arr[right];
	                arr[right]=temp;
	                count++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int tar=sc.nextInt();
        System.out.println(minSwap(arr,tar));
	}
}
