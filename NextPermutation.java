package thirdday;
import java.util.*;
public class NextPermutation {
	 private static void swap(int[] arr,int i,int j){
	        int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    private static void reverse(int[] arr,int st,int end){
	        while(st<end) swap(arr,st++,end--);
	    }
	    public static void nextPermutation(int[] arr,int n) {
	        int pvt=-1;
	        for(int i=n-2;i>=0;i--){
	            if(arr[i]<arr[i+1]){
	                pvt=i;
	                break;
	            }
	        }
	        if(pvt==-1){
	            reverse(arr,0,n-1);
	            return;
	        }
	        for(int i=n-1;i>pvt;i--){
	            if(arr[i]>arr[pvt]){
	                swap(arr,i,pvt);
	                break;
	            }
	        }
	        reverse(arr,pvt+1,n-1);
	    }
	    public static void printArr(int[] arr) {
	    	for(int n:arr) System.out.print(n+" ");
	    	}
	    	public static void main(String[] args) {
	    		Scanner sc=new Scanner(System.in);
	    		int n=sc.nextInt();
	    		int[] arr=new int[n];
	    		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	    		nextPermutation(arr,n);
	            printArr(arr);
	    	}


}
