import java.util.*;

/**
 * @author Tolga Duzenli on 18-Aug-2016.
 */
public class WellFormatParenthesis {

    private Map<Character, Character> wellFormatCharacters = new HashMap<Character, Character>();
    private List<Character> allowedCharacters = new ArrayList<Character>();


    private void initializeWellFormatCharacters() {
        wellFormatCharacters.put('(', ')');
        wellFormatCharacters.put('{', '}');
        wellFormatCharacters.put('[', ']');
    }

    private void initializeAllowedCharacters() {
        allowedCharacters.add('(');
        allowedCharacters.add(')');
        allowedCharacters.add('{');
        allowedCharacters.add('}');
        allowedCharacters.add('[');
        allowedCharacters.add(']');
    }

    public boolean isWellFormat(String input) {
        initializeAllowedCharacters();
        initializeWellFormatCharacters();

        if (input == null) {
            return false;
        } else {
            Stack<Character> stack = new Stack<Character>();

            for (Character c : input.toCharArray()) {
                if (isCharacterAllowedCharacter(c)) {
                    if (isCharacterWellFormatKey(c)) {
                        stack.push(c);
                    } else if (isCharacterWellFormatValue(c)) {
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

    private boolean isCharacterAllowedCharacter(char c) {
        return allowedCharacters.contains(c) ? true : false;
    }

    private boolean isCharacterWellFormatKey(Character c) {
        for (Map.Entry<Character, Character> entry : wellFormatCharacters.entrySet()) {
            if (entry.getKey().equals(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCharacterWellFormatValue(Character c) {
        for (Map.Entry<Character, Character> entry : wellFormatCharacters.entrySet()) {
            if (entry.getValue().equals(c)) {
                return true;
            }
        }
        return false;
    }


}
