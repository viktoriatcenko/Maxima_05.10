package lesson_5;

public class Application {
    public static void main(String[] args) {
        int a = 6;
        int result = factorial(a);

        System.out.println("Factorial of number " + a + " = " + result);
    }

    public static int factorial(int n) { // 3

        System.out.println("Current value of n = " + n);
        if (n == 0) {
            return 1;
        }
        int recursiveFactorial = n * factorial(n - 1);
        System.out.println(recursiveFactorial);
        return recursiveFactorial;
    }
    //        int n1 = n * (n - 1); // n1 = 6 * 5 = 30
//        int n2 = n1 * (n -2); // n2 = 30 * 4 = 120
//        int n3 = n2 * (n -3); // n3 = 120 * 3 = 360
//        int n4 = n3 * (n -4); // n4 = 360 * 2 = 720
//        int n5 = n4 * (n -5); // n5 = 720 * 1 = 720
}
