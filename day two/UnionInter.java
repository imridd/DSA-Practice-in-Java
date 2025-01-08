package secondday;
import java.util.*;
public class UnionInter {
public static Set<Integer> unionArr(int[] a,int[] b) {
	Set<Integer> set=new HashSet<>();
	for(int n:a) set.add(n);
	for(int n:b) {
		set.add(n); 
	}
	return set;
}
public static List<Integer> interArr(int[]a,int[]b){
	Set<Integer> set=new HashSet<>();
	List<Integer> list=new ArrayList<>();
	for(int n:a) {
		set.add(n);
	}
	for(int n:b) {
		if(set.contains(n)) list.add(n);
		set.add(n);
	}
	return list;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++) b[i]=sc.nextInt();
		Set<Integer> set=new HashSet<>(unionArr(a,b));
		System.out.println(set);
		List<Integer> list=new ArrayList<>(interArr(a,b));
		System.out.println(list);
	}
}
