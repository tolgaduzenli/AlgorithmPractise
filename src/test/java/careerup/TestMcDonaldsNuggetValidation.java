package careerup;

import hackerrank.McDonaldsNuggetValidation;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Tolga Duzenli on 2/17/17.
 */
public class TestMcDonaldsNuggetValidation {

    private static McDonaldsNuggetValidation mcDonaldsNuggetValidation;

    @BeforeClass
    public static void setup(){
        mcDonaldsNuggetValidation = new McDonaldsNuggetValidation();
    }

    @Test
    public void testWithFirstHundredNumbers(){
        for(int i = 0; i<=100;i++){
            System.out.println("i : " + i + " - " + mcDonaldsNuggetValidation.isNuggetNumberValid(i));
        }
    }
}
