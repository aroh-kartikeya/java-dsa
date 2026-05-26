import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

 // This is the 2-pointer method
  static void reverse(int[] arr){
      int start=0;//we start from the left and right both and swap the values until we reach in the middle
    int end=arr.length-1;
    while (start<end) {
      swap(arr,start,end);
      start++;
      end--;
      
    }
  }
  
  static void swap(int[] a, int index1, int index2) {
    int temp = a[index1];
    a[index1] = a[index2];
    a[index2] = temp;

  }
  
}
