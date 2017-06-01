import java.util.*;
import java.lang.*;

public class isSubString {

public void issubstring(String s1, String s2){
  String c = s1.concat(s2);
  //System.out.println(c);
  if(c.contains(s2)){
    System.out.println("Yes");
  }
  else
{
  System.out.println("No");
}
}

public static void main(String[] args){
String s1="waterbottle";
String s2="boerttelwat";
isSubString is = new isSubString();
is.issubstring(s1,s2);
}
}
