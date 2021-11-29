package task1;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

/**
 * CustomReplaceMethod class provides method for character replacing
 * @author Nikita Nesterov
 */

public class CustomReplaceMethod {

    /**
     * @param str - String object for replacing
     * @param oldChar - character to replace
     * @param newChar - replacement character
     * @return  new String object
     */
    public static String replaceOneCharacter(String str, char oldChar, char newChar) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> allCharacters = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            allCharacters.add(str.charAt(i));
        }
        List<Character> collect = allCharacters.stream()
                .map(s -> {
                    if (s.equals(oldChar)) {
                        s = newChar;
                    }
                    return s;
                })
                .collect(Collectors.toList());

        for(Character ch : collect) {
            stringBuilder.append(ch);
        }
        return new String(stringBuilder);
    }
}
