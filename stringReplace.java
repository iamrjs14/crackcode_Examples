import java.util.*;
import java.lang.*;

public class stringReplace{

public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  String x = sc.nextLine();
  System.out.println(x);
  if(x.contains(" ")){
    String y = x.replace(" ","%20");
    System.out.println(y);
}
}
}
