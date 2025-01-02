package fourthday;
import java.util.*;
public class SubArrayWith0Sum {
	 public static boolean findSum(int arr[]) {
	        Set<Integer> set=new HashSet<>();
	        int sum=0;
	        for(int n:arr){
	            sum+=n;
	            if(sum==0||set.contains(sum)) return true;
	            set.add(sum);
	        }
	        return false;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(findSum(arr));
	}
}
