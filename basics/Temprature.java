import java.util.*;
public class Temprature
{
  public static void main(String[] args) {
    
  Scanner sc= new Scanner(System.in);
  System.out.println("Input the temprature in celsius");
  float tempCel=sc.nextFloat();
  double tempFah=(tempCel*(9.0/5))+32;
  System.out.println("Temperature in Fahrenheit = "+tempFah);
  sc.close();
  }
}