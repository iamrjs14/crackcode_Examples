import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(",");
        System.out.println(arr.length);
        Set<String> mySet = new HashSet<>(Arrays.asList(arr));
        System.out.println(mySet.size());
        for(String str :mySet) {
            System.out.println(str);
        }
    }
}
