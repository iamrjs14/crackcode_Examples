import java.util.*;
import java.lang.*;

public class oneAway{

public static void main(String[] args){
String x = "pale";
String y = "cale";
char[] ch1 = x.toCharArray();
char[] ch2 = y.toCharArray();
//System.out.println(ch1.length);
//System.out.println(ch2.length);
int counter=0;
if(ch1.length - ch2.length == 1 || ch1.length - ch2.length == 0){
for(int i = 0; i < ch2.length; i++){
if(ch2[i] == ch1[i]){
  counter++;
}
}
if(counter == ch2.length || ch1.length - counter == 1){
  System.out.println("True");
}
else{
  System.out.println("False");
}
}


}
}
