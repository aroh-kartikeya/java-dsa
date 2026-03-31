//Find how many times a digit n has occurred in a number
import java.util.*;
public class CountOccurence {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input a number : ");
    int n=sc.nextInt();
    System.out.println("Input the digit you want to count : ");
    int digit=sc.nextInt();
    int ld=0,count=0;
    while (n>0) {
      ld=n%10;
      if(ld==digit)
        count++;
      n=n/10;
    }
    System.out.println("The digit has occurred " +count+" times");
    sc.close();
  }
  
}
