package eleventhday;
import java.util.*;
public class PrintSubSeq {
public static void printSub(String s,String ans) {
	if(s.length()==0) {
		System.out.print(""+ans+" ");
		return;
	}
	char ch=s.charAt(0);
	String res=s.substring(1);
	printSub(res,ans);
	printSub(res,ans+ch);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        printSub(s," ");
	}
}
