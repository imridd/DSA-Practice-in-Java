package sixthday;
import java.util.*;
public class CheckingSubset {
	 public static boolean isSubset(int a[], int b[]) {
	        Set<Integer> set=new HashSet<>();
	        for(int i:a) set.add(i);
	        for(int i:b){
	            if(set.contains(i)) continue;
	            else return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int m=sc.nextInt();
        int[] b=new int[m];
		for(int i=0;i<m;i++) b[i]=sc.nextInt();
		System.out.println(isSubset(arr,b));
	}
}
