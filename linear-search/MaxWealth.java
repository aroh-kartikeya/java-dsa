//Leetcode Question
//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 24, 65, 3, 2, 5 }, { 7, 55, 122, 689, 4542, 1441 } };
    System.out.println(maximumWealth(arr));
  }

  static int maximumWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < accounts.length; person++) {
      int sum = 0;
      for (int account = 0; account < accounts[person].length; account++) {
        sum += accounts[person][account];
      }
      if (sum > ans)
        ans = sum;
    }
    return ans;
  }
}
