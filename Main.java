import java.util.Arrays;

class SimpleCalculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public float div(int a, int b) {
        return (float) a /b;
    }
}
class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        if (args.length > 0) {
            String input = args[0];

            String currentNumber = "";
            int result = 0;
            char operation = '+';

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isDigit(c)) {
                    currentNumber += c;
                }

                if (!Character.isDigit(c) || i == input.length() - 1) {
                    int num = Integer.parseInt(currentNumber);

                    switch (operation) {
                        case '+': result = calc.add(result, num); break;
                        case '-': result = calc.sub(result, num); break;
                        case '*': result = calc.mul(result, num); break;
                        case '/': result = (int) calc.div(result, num); break;
                    }

                    operation = c;
                    currentNumber = "";
                }
            }

            System.out.println(result);
        }
    }
}