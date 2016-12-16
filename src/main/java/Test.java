/**
 * @author Tolga Duzenli on 16-Dec-2016.
 */
public class Test {

    public static void main(String[] args) {
        String s = "123f.";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(Character.isLetterOrDigit(s.charAt(i)));
        }
    }
}
