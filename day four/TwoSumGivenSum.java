package fourthday;
import java.util.*;
public class TwoSumGivenSum {
	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
	       Set<Integer> seen = new HashSet<>();
	        Set<String> uniquePairs = new HashSet<>();
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        for (int num : arr) {
	            if (seen.contains(-num)) {
	                int smaller = Math.min(num, -num);
	                int larger = Math.max(num, -num);
	                String pair = smaller + "," + larger;
	                if (!uniquePairs.contains(pair)) {
	                    uniquePairs.add(pair);
	                    result.add(new ArrayList<>(Arrays.asList(smaller, larger)));
	                }
	            }
	            seen.add(num);
	        }
	        Collections.sort(result, (a, b) -> a.get(0) != b.get(0) ? a.get(0) - b.get(0) : a.get(1) - b.get(1));
	        return result;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(getPairs(arr));
        for (ArrayList<Integer> pair : result) {
            System.out.println(pair);
        }
	}

}
