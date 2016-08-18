import java.util.*;

/**
 * @author Tolga Duzenli on 18-Aug-2016.
 */
public class WellFormatParenthesis {

    private Map<Character, Character> wellFormatCharacters = new HashMap<Character, Character>();
    private List<Character> allowedCharacters = new ArrayList<Character>();


    /**
     * Initialize well format key value pairs.
     */
    private void initializeWellFormatCharacters() {
        wellFormatCharacters.put('(', ')');
        wellFormatCharacters.put('{', '}');
        wellFormatCharacters.put('[', ']');
    }

    /**
     * Initialize allowed characters for input string
     */
    private void initializeAllowedCharacters() {
        allowedCharacters.add('(');
        allowedCharacters.add(')');
        allowedCharacters.add('{');
        allowedCharacters.add('}');
        allowedCharacters.add('[');
        allowedCharacters.add(']');
    }

    /**
     * @param input
     * @return
     */
    public boolean isWellFormat(String input) {
        initializeAllowedCharacters();
        initializeWellFormatCharacters();

        if (input == null) {
            return false;
        } else {
            Stack<Character> stack = new Stack<Character>();

            for (Character c : input.toCharArray()) {
                if (checkAcceptedCharacter(c)) {
                    if (checkKeyValues(c)) {
                        stack.push(c);
                    } else if (checkValues(c)) {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        } else {
                            return false;
                        }

                    }
                }
            }
            return stack.isEmpty();
        }

    }

    private boolean checkAcceptedCharacter(char c) {
        return allowedCharacters.contains(c) ? true : false;
    }

    /**
     * @param c
     * @return
     */
    private boolean checkKeyValues(Character c) {
        for (Map.Entry<Character, Character> entry : wellFormatCharacters.entrySet()) {
            if (entry.getKey().equals(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param c
     * @return
     */
    private boolean checkValues(Character c) {
        for (Map.Entry<Character, Character> entry : wellFormatCharacters.entrySet()) {
            if (entry.getValue().equals(c)) {
                return true;
            }
        }
        return false;
    }


}
