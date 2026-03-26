import java.util.Scanner;
public class CaseCheck {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input a string");
    String s=sc.nextLine();
    if(Character.isLowerCase(s.charAt(0)))
      System.out.println("First letter is in lowercase");
    else
       System.out.println("First letter is in uppercase");
    sc.close();
  }
  
}
