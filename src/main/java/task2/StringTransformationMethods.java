package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * StringTransformationMethods class provides method for converting a string to numeric expressions
 * @author Nikita Nesterov
 */
public class StringTransformationMethods {


    /**
     * @param str  - String object for converting
     * @return - int as a sum of character's numeric expressions
     */
    public static int stringToIntTransformation(String str) {
        int intSum;
        List<Character> allCharacters = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            allCharacters.add(str.charAt(i));
        }
        intSum = allCharacters.stream().mapToInt(s -> s).sum();
        try{
            if (intSum <= Integer.MAX_VALUE) {
                return intSum;
            } else throw new ExceedRangeException("Полученное выражение не является примитивом типа int");
        } catch (ExceedRangeException ex) {
            System.out.println("Полученное выражение не является примитивом типа int");
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * @param str - String object for converting
     * @return - double as a sum of character's numeric expressions
     */
    public static double stringToDoubleTransformation(String str) {
        double doubleSum;
        List<Character> allCharacters = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            allCharacters.add(str.charAt(i));
        }
        doubleSum = allCharacters.stream().mapToInt(s -> s).sum();
        try{
            if (doubleSum <= Integer.MAX_VALUE) {
                return doubleSum;
            } else throw new ExceedRangeException("Полученное выражение не является примитивом типа double");
        } catch (ExceedRangeException ex) {
            System.out.println("Полученное выражение не является примитивом типа double");
            ex.printStackTrace();
        }
        return 0;
    }
}
