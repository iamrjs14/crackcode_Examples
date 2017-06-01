import java.util.*;
import java.lang.*;

public class setZero{
  public void zero(int[][] m){
    for(int i=0; i<m.length; i++){
      for(int j=0;j<m[0].length;j++){
        if(m[i][j] == 0){
          int c = i;
          int d = j;
          addzero(c,d,m);
}
}
}
}
public void addzero(int c,int d, int[][] m){
    System.out.println(m.length);
    for(int l=0; l<m.length;l++){
        m[c][l] = 0;
        m[l][d] = 0;
  }
    for(int[] element : m){
      for(int z : element){
        System.out.print(z+" ");
}
      System.out.println();
}
}

public static void main(String[] args){
int[][] m = {{2,3,4},{1,2,5},{7,0,3},{3,2,6}};
setZero sz = new setZero();
sz.zero(m);
}
}
