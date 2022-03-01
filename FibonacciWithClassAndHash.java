/*Четвертое задание по рядам Фибоначчи : с помощью отдельного класса*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciWithClassAndHash {
    public static List<Integer> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < number; i++) {
            list.add(Fibonacci.fib(i));
        }
        for (int everyNumber : list) {
            System.out.println(everyNumber);
        }
    }

}

/*Отдельный класс с методом, вычмсляющим числа Фибоначчи*/
class Fibonacci {
    public  static int fib(int number) {
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else
            return fib(number - 1) + fib(number - 2);
    }
}