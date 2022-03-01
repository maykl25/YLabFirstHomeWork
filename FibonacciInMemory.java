/* Второе задание по ряду Фибоначчи : с помощью цикла с использованием памяти*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FibonacciInMemory {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(reader.readLine());
            int[] fibNumbers = memoryFibonacci(number);
            for (int everyNumber : fibNumbers) {
                System.out.print(everyNumber + " ");
            }
        } catch (IOException exception) {
            System.out.println("An exception occurs");
        }
    }


public static int[] memoryFibonacci(int n) {
    int[] numbers = new int[n];
    numbers[0] = 0;
    numbers[1] = 1;
    for (int i = 2; i < n; i++) {
        numbers[i] = numbers[i - 1] + numbers[i - 2];
    }
    return numbers;
}

}
