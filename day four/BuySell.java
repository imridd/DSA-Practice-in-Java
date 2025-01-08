package fourthday;
import java.util.*;
public class BuySell {
	public static int maxProfit(int[] prices) {
        int minP=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            minP=Math.min(minP,prices[i]);
            res=Math.max(res,prices[i]-minP);
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(maxProfit(arr));
	}
}
