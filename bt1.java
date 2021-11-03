package String;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class b1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        s = s.replace(" ", "");
        System.out.println(s);
    }
}