package seventhday;
import java.util.*;
public class ThreeArrPart {
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void threeWayPartition(int arr[], int a, int b) {
         int n = arr.length;
        int start = 0, end = n - 1, index = 0;
        while (index <= end) {
            if (arr[index] < a) {
                swap(arr, start, index);
                start++;
                index++;
            } else if (arr[index] > b) {
                swap(arr, index, end);
                end--;
            } else {
                index++;
            }
        }
    }
	public static void main(String[] args) {
		

	}

}
