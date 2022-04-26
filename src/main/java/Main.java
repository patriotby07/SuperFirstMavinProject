

public class Main {

    public static double calc(double a, double b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    return 0;
                }else {
                    return  a / b;
                }
            default:
               return 0.0;
        }
    }

    public static void main(String[] args) {

    }
}
