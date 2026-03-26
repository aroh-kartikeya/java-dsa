import java.util.Scanner;

public class Largest_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.println("Input first number:");
    a = sc.nextInt();
    System.out.println("Input second number:");
    b = sc.nextInt();
    System.out.println("Input third number:");
    c = sc.nextInt();
    int largest = a;
    if (largest < b)
      largest = b;
    if (largest < c)
      largest = c;
    System.out.println("Largest value = " + largest);

    // we can also use math.max function as well

    sc.close();
  }
}