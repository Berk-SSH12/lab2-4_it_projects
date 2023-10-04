package gradle;

public class App {

    public static final int CORRECT_ANSWER = 5;
    public static final String CORRECT_STRING = "The result is correct, Good boy";

    public static int add(int number1, int number2) {
        long  sum = (long) number1 + number2;
        if (sum > Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer overflow");
        }

        return (int) sum;
    }

    public static String correctAnswer(String myString){
        if(myString == CORRECT_STRING){
            System.out.println(myString);
        }
        
        return myString;
    }

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        int result = add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);

        if(result == CORRECT_ANSWER){
            String myString = "The result is correct, Good boy";
            correctAnswer(myString);
        }
        else
            System.out.println("Damn..., you need an answer '5'");
    }
}