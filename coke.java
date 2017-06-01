//what will you do if you have coke and sprite cans and any button.

import java.util.*;
public class coke{
public static void main(String[] args){
String str = "cscscsccscssccs";
ArrayList<Character> a = new ArrayList<Character>();
for(char c: str.toCharArray()){
  a.add(c);
System.out.print(c+" ");
}

Scanner sc = new Scanner(System.in);
while(a.size()>0){
System.out.println("Please Enter the drink you want:");
char x = sc.next().charAt(0);
//System.out.println(x);
for(int i=0; i<a.size(); i++){
if(x == 'c') {

    a.remove(Character.valueOf('c'));
    System.out.println("Coke dispatched");
    break;
    }
else if(x == 's'){
  a.remove(Character.valueOf('s'));
  break;
}
else if(x == 'a'){
  a.remove(0);
  break;
}
}
for(char c : a){
    System.out.print(c+" ");

}
  System.out.print(a.size());
}
}
}
