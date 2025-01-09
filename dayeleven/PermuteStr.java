package eleventhday;
import java.util.*;
public class PermuteStr {
	private static void swap(char[]ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    private static void solve(char[] ch,List<String>list,int idx){
        if(idx>=ch.length){
            list.add(new String(ch));
            return;
        }
        Set<Character> set=new HashSet<>();
        for(int j=idx;j<ch.length;j++){
            if(set.contains(ch[j])) continue;
            set.add(ch[j]);
            swap(ch,idx,j);
            solve(ch,list,idx+1);
            swap(ch,idx,j);
        }
    }
    public static List<String> findPermutation(String s) {
        List<String> list=new ArrayList<>();
        char[] ch=s.toCharArray();
        int idx=0;
        solve(ch,list,idx);
        Collections.sort(list);
        return list;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        List<String> list=findPermutation(s);
        for(String str:list) System.out.print(str+" ");
	}
}
