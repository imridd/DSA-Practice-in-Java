package sixthday;
import java.util.*;
public class ChocolateDistribution {
	 public static int findMinDiff(ArrayList<Integer> arr, int m) {
	       if (m == 0 || arr.size() == 0) {
	            return 0;
	        }
	        Collections.sort(arr);
	        if (arr.size() < m) 
	            return -1; 
	        int minDifference = Integer.MAX_VALUE;
	        for (int i = 0; i + m - 1 < arr.size(); i++) {
	            int difference = arr.get(i + m - 1) - arr.get(i);
	            minDifference = Math.min(minDifference, difference);
	        }
	        return minDifference;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) list.add(sc.nextInt());
        int m=sc.nextInt();
        System.out.println(findMinDiff(list,m));
	}
}
