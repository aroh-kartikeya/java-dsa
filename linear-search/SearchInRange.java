//Search for 'u' in the range of index [1,4]

public class SearchInRange {
  public static void main(String[] args) {
    String name ="Aishwarya";
    char target='u';
    System.out.println(search(name,target));

  }

  static boolean search (String str, char target) {
    if(str.length()==0)
    return false;

    //We will just search in the range of 1 to 4 index. that's it. Nothing more changes.
    for(int i=1;i<4;i++) {
      if(str.charAt(i)==(target))
        return true;
    }

    return false;
  } 
}
