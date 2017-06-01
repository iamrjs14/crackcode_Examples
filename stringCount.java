import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class stringCount{

public static void main(String[] args){
  stringCount sc = new stringCount();
  sc.match();

}

public int match(){

String regex = " ";
String line = "aaaabbcccc";
String fix = "abc";
char[] ch1 = fix.toCharArray();
for(int i=0;i<ch1.length;i++){
regex = String.valueOf(ch1[i]);
//System.out.println(ch1[i]);
}
int x = 0;
String y1=" ";
String y = " ";
Pattern r = Pattern.compile(regex);
Matcher m = r.matcher(line);
StringBuffer sb = new StringBuffer();
while(m.find()){
  y1 = m.group();
  y = sb.append(y).toString();
  x = x + y.length();
  }
for(int k = 0; k < ch1.length;k++){
  join(y, x);
}
return x;
}


public void join(String c, int x){
StringBuilder sb = new StringBuilder(c);
String j = sb.append(x).toString();
System.out.println(j);

}
}
