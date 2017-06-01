import java.util.*;

public class linkedList{

public static void main(String[] args){
LinkedList x = new LinkedList();
String s1 = "FOLLOW UP";
char[] ch = s1.toCharArray();
for (char c:ch){
x.add(c);
}

  for(int i = 0; i<x.size();i++){
      for(int j = 0; j<x.size();j++){
          if(x.get(i) == x.get(j) && i!=j){
              x.remove(j);
  }
}
}
    ListIterator<LinkedList> itr = x.listIterator();
    while(itr.hasNext()){
    System.out.print(itr.next()+" ");
  }
}
}
