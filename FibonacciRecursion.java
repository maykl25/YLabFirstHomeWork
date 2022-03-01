/* Первое задание по ряду Фибоначчи : с помощью рекурсии */
public class FibonacciRecursion {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(fib(i));
        }

    }
    public  static int fib(int number) {
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else
        return fib(number - 1) + fib(number - 2);
    }
}
