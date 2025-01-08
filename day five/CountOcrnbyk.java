package fifthday;
import java.util.*;
public class CountOcrnbyk {
	 public static int countOccurence(int[] arr, int k) {
	        int n=arr.length;
	        int val=n/k;
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int s:arr){
	            map.put(s,map.getOrDefault(s,0)+1);
	        }
	        int x=0;
	        for(int s:map.values()){
	            if(s>val) x++;
	        }
	        return x;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(countOccurence(arr,k));
	}
}
