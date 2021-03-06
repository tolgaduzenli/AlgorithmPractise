package hackerrank;

/**
 * @author Tolga Duzenli on 2/17/17.
 *         Problem: McDonalds sells chicken McNuggets in packages of 20,9 or 6 McNuggets.
 *         Determine when customers give an order that their nugget number is valid or not?
 *         Forexample Customers can buy 15 nuggets (1 box 9, 1 box 6) but they can not buy 16 nuggets.
 *         Write a method which gets one input number and returns true or false.
 */
public class McDonaldsNuggetValidation {


    public boolean isNuggetNumberValid(int n) {
        return (n >= 0 && (n == 0
                || isNuggetNumberValid(n - 6)
                || isNuggetNumberValid(n - 9)
                || isNuggetNumberValid(n - 20)));
    }

    public boolean isValid(int n) {
        boolean result;
        if(n < 6){
            return false;
        }
        if (n - 20 == 0 || n - 9 == 0 || n - 6 == 0) {
            result = true;
        } else  {
            result = isValid(n - 20);
            if(!result){
                result = isValid(n-9);
                if(!result){
                    result = isValid(n-6);
                }
            }
        }
        return result;
    }
}
