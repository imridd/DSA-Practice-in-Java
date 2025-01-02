package fourthday;
import java.util.*;
public class IntersectionOf3Arr {
public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
            List<Integer> arr3) {
Set<Integer> set1=new HashSet<>(arr1);
Set<Integer> set2=new HashSet<>(arr2);
Set<Integer> set3=new HashSet<>(arr3);
ArrayList<Integer> list=new ArrayList<>();
Map<Integer,Integer> map=new HashMap<>();
for(int i:set1) map.put(i,map.getOrDefault(i,0)+1);
for(int i:set2) map.put(i,map.getOrDefault(i,0)+1);
for(int i:set3) map.put(i,map.getOrDefault(i,0)+1);
for(Map.Entry<Integer,Integer> en:map.entrySet()){
if(en.getValue()>=3) list.add(en.getKey());
}
if(list.isEmpty()){
list.add(-1);
return list;
}
Collections.sort(list);
return list;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n1 = sc.nextInt();
	        List<Integer> arr1 = new ArrayList<>();
	        System.out.println("Enter elements of the first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1.add(sc.nextInt());
	        }
	        System.out.println("Enter the size of the second array:");
	        int n2 = sc.nextInt();
	        List<Integer> arr2 = new ArrayList<>();
	        System.out.println("Enter elements of the second array:");
	        for (int i = 0; i < n2; i++) {
	            arr2.add(sc.nextInt());
	        }
	        System.out.println("Enter the size of the third array:");
	        int n3 = sc.nextInt();
	        List<Integer> arr3 = new ArrayList<>();
	        System.out.println("Enter elements of the third array:");
	        for (int i = 0; i < n3; i++) {
	            arr3.add(sc.nextInt());
	        }
	        IntersectionOf3Arr obj = new IntersectionOf3Arr();
	        List<Integer> result = obj.commonElements(arr1, arr2, arr3);
	        System.out.println("Common elements in all three arrays: " + result);
	    }

	}

