package seventhday;
import java.util.*;
public class MedianOf2Arr {
	public static double medianOf2(int a[], int b[]) {
        List<Integer> list=new ArrayList<>();
        for(int val:a) list.add(val);
        for(int val:b) list.add(val);
        Collections.sort(list);
        int n=list.size();
        if(n%2!=0) return list.get(n/2);
        else return (list.get(n / 2) + list.get((n / 2) - 1)) / 2.0;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        System.out.println(medianOf2(arr,b));
	}

}
