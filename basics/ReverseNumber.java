import java.util.Scanner;
public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input a number : ");
    int n=sc.nextInt();
    int ld=0,reverse=0;
    while (n>0) {
      ld=n%10;
      reverse=reverse*10+ld;
      n=n/10;
    }
    System.out.print("Reverse of the "+n+" is : "+reverse);
    sc.close();

    // I can also use n.reverse() to reverse the number directly
  }
  
}
