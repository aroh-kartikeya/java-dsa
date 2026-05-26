
public class FindMin {
  public static void main(String[] args) {
    int[] arr={47,25,73,24,65,46,87,98,19};
    System.out.println(min(arr));
  }

  static int min (int[] arr){
    int minimum=arr[0];
    for(int i=0;i<arr.length;i++)
    {
      if(minimum>arr[i])
        minimum=arr[i];
    }
    return minimum;
  }
}
