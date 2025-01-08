package ninthday;
import java.util.*;
public class CommonElementsInRows {
    public static void findCommonElements(int[][] mat) {
        int m = mat.length;  
        int n = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            map.put(mat[0][j], 1);
        }
        for (int i = 1; i < m; i++) {
            Set<Integer> rowElements = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (map.containsKey(mat[i][j]) && !rowElements.contains(mat[i][j])) {
                    rowElements.add(mat[i][j]);
                    map.put(mat[i][j], map.get(mat[i][j]) + 1);
                }
            }
        }
        System.out.println("Common elements present in all rows:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == m) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9}
        };

        findCommonElements(mat);
    }
}
