import java.util.Scanner;

class SwapTwoNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1st number:");
    int a=sc.nextInt();
    
    System.out.print("Enter 2nd number:");
    int b=sc.nextInt();

    swap(a,b); 
    /* In this, the actual values of a and b are not passed. 
    In java there's only call by value and not by reference
    So in this case, a copy of the reference i.e. the address of the object that a was pointing to is passed to swap
    And then that copy also points to the same object but since its a copy, it won't change the values of the original a and b variables*/
    System.out.println(a+" "+b); 
    sc.close();
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a + " " + b);// we didn't change objects, instead created new objects 

  }
}