package fifthday;
import java.util.*;
public class MaxPro2Tra {
	  public static int maxProfit(int n, int[] price) {
	       int buy1=Integer.MAX_VALUE;
	       int buy2=Integer.MAX_VALUE;
	       int pro1=0;
	       int pro2=0;
	       for(int i:price){
	           buy1=Math.min(buy1,i);
	           pro1=Math.max(pro1,i-buy1);
	           buy2=Math.min(buy2,i-pro1);
	           pro2=Math.max(pro2,i-buy2);
	       }
	       return pro2;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();	
        System.out.println();
	}
}
