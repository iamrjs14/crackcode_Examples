import java.util.*;

public class lastElement{

public void findElement(int k){
LinkedList<Integer> ll = new LinkedList<Integer>();
int[] x = {2,3,446,645,746,67,5,7,867,96,968,78};
for(int j:x){
  ll.add(j);
  System.out.print(j+" ");
}

 if(k < ll.size()){
   int p = ll.size() - k;
   System.out.println(ll.get(p));

}

}

  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int k = sc.nextInt();
  lastElement le = new lastElement();
  le.findElement(k);
}
}
