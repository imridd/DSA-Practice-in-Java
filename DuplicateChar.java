package tenthday;
import java.util.*;
public class DuplicateChar {
public static void printDup(String s) {
	Map<Character,Integer> map=new HashMap<>();
	for(char c:s.toCharArray()) {
		map.put(c,map.getOrDefault(c,0)+1);
	}
	for(Map.Entry<Character,Integer>en:map.entrySet()) {
		 if (en.getValue() > 1)
		        System.out.println(en.getKey()+" count= "+en.getValue());
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printDup(s);
	}
}
