import java.util.*;
import java.lang.*;
public class stringPermutation{


  public static ArrayList<String> permutation(String s){

    ArrayList<String> res = new ArrayList<String>();
    if(s.length() == 0){
      res.add(s);
    }
    else{
      int last = s.length()-1;
      String ls = s.substring(last);
      String total = s.substring(0,last);
      res = merge(permutation(total),ls);
      check(res,s);


    }

    for(int j=0; j<res.size();j++) {
      System.out.println(res.get(j));
      }
      return res;
    }

  public static ArrayList<String> merge(ArrayList<String> list, String c){
    ArrayList<String> res = new ArrayList<String>();
    for(String s : list){
      for(int i=0; i<= s.length(); i++){
        String ps = new StringBuffer(s).insert(i,c).toString();
        res.add(ps);
      }
    }
    return res;
  }

  public static boolean check(ArrayList<String> list, String y){
    if(list.contains(y)){
      System.out.println("True");
      return true;
    }
  }

  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String x = sc.next();
        String y = sc.next();
        sc.close();
        //String s = "abcd";
        stringPermutation sp = new stringPermutation();
        sp.permutation(x);
        //sp.check(res,y);

        //boolean retval = res.contains(y);
        //System.out.println(retval);

}
}
