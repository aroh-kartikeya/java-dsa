
import java.util.*;
public class TryArrayList {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();

    //input
    for(int i =0; i<5;i++){
      list.add(sc.nextInt());
    }

    //printing
    System.out.println(list);
    sc.close();
  }
  
}
