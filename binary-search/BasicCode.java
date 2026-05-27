public class BasicCode {
  public static void main(String[] args) {
    int arr[]= {-78,-45,-1,0,1,2,4,5,14,24,36,94,111};
    int target=146;
    System.out.println(binarySearch(arr, target));
  }

  static int binarySearch(int arr[],int target) {
    int start =0;
    int end =arr.length-1;
    int mid;
// Array is sorted in ascending order
    while (start<=end) {
      mid = start+(end-start)/2;
      if(target>arr[mid]){
        start=mid+1; 
      }
      else if(target<arr[mid]){
        end = mid-1; 
      }
      else
        return mid;
      
    }
    return -1;
  }
}
