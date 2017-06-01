import java.util.*;
public class palin{

public void isPalindrome(String x){
char[] ch = x.toCharArray();
LinkedList<Character> ll = new LinkedList<Character>();
for(char j : ch){ll.add(j);
  //System.out.print(j+" ");}
}

ListIterator<Character> itr = ll.listIterator(ll.size());
while(itr.hasPrevious()){
char c = Character.valueOf(itr.previous());
for(char k : ch){
  if(k == c){
    System.out.println("It is Palindrome");
    break;
  }
  else{
      System.out.println("It is not Palindrome");
      break;
}
}
break;
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
palin pl = new palin();
pl.isPalindrome(str);

}
}
