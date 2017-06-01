import java.util.*;
import java.lang.*;

public class stringPalindrome{

      public static ArrayList<String> permutation(String c){
      ArrayList<String> result = new ArrayList<String>();
      if(c.length()==0){
      result.add(c);
      }
      else{

      int last_index = c.length()-1;
      String last = c.substring(last_index);
      String rest = c.substring(0,last_index);
      result = merge(permutation(rest), last);
}
      String y = new StringBuffer(c).reverse().toString();
      System.out.println(y);
      if(result.contains(y)){
      System.out.println("Yes");
}
      //for(int k = 0; k<result.size();k++){
      //System.out.println(result.get(k));
//}
      return result;

}
      public static ArrayList<String> merge(ArrayList<String> list, String c){
      ArrayList<String> result = new ArrayList<String>();
      for(String s:list){
      for(int i=0; i<=s.length(); i++){
      String ps = new StringBuffer(s).insert(i,c).toString();
      result.add(ps);
    }
    }
      return result;
    }    
       public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);
       String x = sc.nextLine();
       stringPalindrome sp = new stringPalindrome();
       sp.permutation(x);
    }
}
