import java.util.*;

public class doubleToBinary{
public void convertedBinary(double x){
//double x = this.x;
//int y = x.intValue();

System.out.print(Long.toBinaryString(Double.doubleToRawLongBits(x)));
System.out.println(x);
}


public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double n = sc.nextDouble();
doubleToBinary db = new doubleToBinary();
db.convertedBinary(n);

}
}
