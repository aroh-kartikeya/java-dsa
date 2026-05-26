
import java.util.*;

public class Swap {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    swap(arr, 1, 2);
    System.out.println(Arrays.toString(arr));

  }

  static void swap(int[] a, int index1, int index2) {
    int temp = a[index1];
    a[index1] = a[index2];
    a[index2] = temp;

  }

}
