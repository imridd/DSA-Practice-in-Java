package fifthday;
import java.util.*;
public class LonConSub {
public static int conSub(int[] arr) {
	Set<Integer> set=new HashSet<>();
	int res=0;
	for(int n:arr) set.add(n);
	for(int n:arr) {
		if(set.contains(n)&&!set.contains(n-1)) {
			int cur=n, cnt=0;
			while(set.contains(cur)) {
				set.remove(cur);
				cur++;
				cnt++;
			}
			res=Math.max(cnt, res);
		}
	}
	return res;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(conSub(arr));
	}
}
