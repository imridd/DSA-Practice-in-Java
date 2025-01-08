package thirdday;
import java.util.*;
public class MergeOverlap {
	public static List<int[]> merge(int[][] arr) {
	     Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
	     List<int[]>list=new ArrayList<>();
	     list.add(new int[]{arr[0][0],arr[0][1]});
	     for(int i=1;i<arr.length;i++){
	        int[] last=list.get(list.size()-1);
	        int[] curr=arr[i];
	    if(curr[0]<=last[1]) last[1]=Math.max(last[1],curr[1]);
	    else list.add(new int[]{curr[0],curr[1]});
	     } 
	     return list;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
List<int[]> list=new ArrayList<>(merge(arr));
for (int[] interval : list) {
    System.out.println("[" + interval[0] + ", " + interval[1] + "]");
}
	}
}
