//Find the nth fibonacci number
import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Input the position");
    int n=sc.nextInt();
    int a =0, b=1;
    for(int i=2;i<=n;i++){
      int temp=b;
      b=b+a;
      a=temp;  
    }
    System.out.println(b);
    sc.close();
    
  }
}
