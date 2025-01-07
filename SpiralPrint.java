package eigthday;
import java.util.*;
public class SpiralPrint {
public static List<Integer> spiralTra(int[][] arr){
	List<Integer> list=new ArrayList<>();
	int m=arr.length;
	int n=arr[0].length;
	int top=0, bot=m-1, left=0, right=n-1;
	while(top<=bot && left<=right) {
		for(int i=left;i<=right;i++) list.add(arr[top][i]);
		top++;
		for(int i=top;i<=bot;i++) list.add(arr[i][right]);
		right--;
		if(top<=bot) {
			for(int i=right;i>=left;i--) list.add(arr[bot][i]);
			bot--;
		}
		if(left<=right) {
			for(int i=bot;i>=top;i--) list.add(arr[i][left]);
			left++;
		}
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
		List<Integer> list=new ArrayList<>(spiralTra(arr));
		System.out.println(list.toString());
	}
}
