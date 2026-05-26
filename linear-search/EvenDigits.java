//This is a leetcode question
//https://leetcode.com/submissions/detail/2013647922/

public class EvenDigits {
  public static void main(String[] args) {

    int[] arr = { 12, 45, 94215, 46, 745, 522 };
    System.out.println(findNumbers(arr));

  }

  static int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    int numberOfDigits = digits(num);

    /*
     * if(numberOfDigits%2==0)
     * return true;
     * else
     * return false;
     */

    return numberOfDigits % 2 == 0;

  }

  static int digits(int num) {
   /* int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;*/

    return (int)(Math.log10(num)+1); //Shortcut to find the number of digits of any number
  }
}
