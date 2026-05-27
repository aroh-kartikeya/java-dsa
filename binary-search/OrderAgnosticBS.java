
public record OrderAgnosticBS() {
  public static void main(String[] args) {
    int arr[] = { -78, -45, -1, 0, 1, 2, 4, 5, 14, 24, 36, 94, 111 };
    int target = 146;
    System.out.println(orderAgnosticBS(arr, target));

  }

  static int orderAgnosticBS(int arr[], int target) {

    int start = 0;
    int end = arr.length - 1;
    int mid;

    // check how the array is sorted
    boolean isAsc = start < end;

    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target)
        return mid;

      if (isAsc) {
        if (target > arr[mid]) {
          start = mid + 1;
        } else
          end = mid - 1;
      } else {
        if (target < arr[mid]) {
          start = mid + 1;
        } else
          end = mid - 1;
      }
    }
    return -1;

  }

}
