import java.util.*;
import wow.Helper;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sw=sc.nextLine();
        String c=new StringBuilder(sw).reverse().toString();
        Helper one=new Helper(23);
        one.get();
        one.mul(5,3);
        System.out.println(c);
    }
}