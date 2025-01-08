package tenthday;
import java.util.*;
public class CountSay {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = getNextSequence(result);
        }
        return result;
    }
    private static String getNextSequence(String sequence) {
        StringBuilder nextSequence = new StringBuilder();
        int count = 1;
        char currentChar = sequence.charAt(0);

        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == currentChar) {
                count++;
            } else {
                nextSequence.append(count).append(currentChar);
                currentChar = sequence.charAt(i);
                count = 1;
            }
        }
        nextSequence.append(count).append(currentChar);
        return nextSequence.toString();
    } 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    CountSay sol=new CountSay();
    int n=sc.nextInt();
    String s=sol.countAndSay(n);
    System.out.println(s);
    sc.close();
}}
