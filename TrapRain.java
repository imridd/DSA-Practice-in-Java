package sixthday;
import java.util.*;
public class TrapRain {
	 public static int trappingWater(int arr[]) {
	        int n=arr.length;
	        int left=0, right=n-1;
	        int maxL=0, maxR=0, water=0;
	        while(left<right){
	            if(arr[left]<=arr[right]){
	                if(arr[left]>=maxL) maxL=arr[left];
	                else water+=maxL-arr[left];
	                left+=1;
	            }
	            else{
	                if(arr[right]>=maxR) maxR=arr[right];
	                else water+=maxR-arr[right];
	                right-=1;
	            }
	        }
	        return water;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(trappingWater(arr));
	}
}
