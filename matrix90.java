import java.util.*;
import java.lang.*;

public class matrix90{
public void transpose(int[][] m){
  for(int i=0;i<m.length;i++){
    for(int j=i;j<m[0].length;j++){
      //System.out.println(m[0].length);
      int x = m[i][j];
      m[i][j] = m[j][i];
      m[j][i] = x;
    }
}
}

public void swap(int[][] m){
transpose(m);
for(int j=0; j<m[0].length/2; j++){
  for(int i=0; i<m.length; i++){
      int x = m[i][j];
      m[i][j] = m[i][m[0].length - 1 - j];
      m[i][m[0].length - 1 - j] = x;
}
}
  for(int i = 0; i< m.length; i++){
    for(int j = 0; j< m[0].length; j++){
        System.out.print(m[i][j] + " ");
}
      System.out.println();
}
}
public static void main(String[] args){
int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
matrix90 m9 = new matrix90();
m9.swap(matrix);
}
}
