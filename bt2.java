package String;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class b2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        char[] a = s.toCharArray();
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (check) {
                a[i] = Character.toUpperCase(a[i]);
                check = false;
            }
            if (a[i] == ' ') {
                check = true;
            }
        }
        s = String.valueOf(a);
        System.out.println(s);
    }    
}