package task3;

/**
 * ScreenPrinerClass - print output int numbers from 1 to 100 to Console
 * @author Nikita Nesterov
 */
public class ScreenPrinter {

    /**
     * @param number  = int dividend
     * @param divider  - int divider
     * @return boolean expression
     * @throws ArithmeticException
     */
    private static boolean ifMultiples(int number, int divider) throws ArithmeticException{
        if(number % divider == 0) {
            return true;
        } else return false;
    }

    /**
     * Method should print output numbers from 1 to 100 to Console with
     * - some conditions: if number multiples 3 should print "Fizz" except number
     * - if number multiples 5 should print "Buzz" except number
     * - if number multiples 15 should print "FizzBuzz" except number
     */
    public static void printNumbers() {
        for(int i = 1; i <=100; i++) {
         if(ifMultiples(i, 15)) {
             System.out.println("FizzBuzz;");
         } else if(ifMultiples(i, 3)) {
            System.out.println("Fizz");
         } else if(ifMultiples(i, 5)) {
             System.out.println("Buzz");
         } else System.out.println(i);
        }
    }
}
