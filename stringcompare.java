import java.util.*;
import java.lang.*;
public class stringcompare{

	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
      	System.out.println("Enter a String:");
      	String x = sc.next();
      	sc.close();
				char[] ch = x.toCharArray();
				System.out.println(ch.length);
		HashSet<Character> chset = new HashSet<Character>();
			for(char w: ch){
				chset.add(w);
			}
				System.out.println(chset.size());
			if(ch.length == chset.size()){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
}
}
