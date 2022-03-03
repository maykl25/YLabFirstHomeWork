import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class FibonacciWithClass {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(reader.readLine());
        Fibonachi fib = new Fibonachi();
        ArrayList<Long> numbers = fib.memoryFibonacci(number);
        for (long everyNumber : numbers) {
            System.out.print(everyNumber + " ");
        }
    }
}

class Fibonachi {
    public ArrayList<Long> fibNumbers = new ArrayList<>();

    public ArrayList<Long> memoryFibonacci(int n) {
        fibNumbers.add(0L);
        fibNumbers.add(1L);
        for (int i = 2; i < n; i++) {
            fibNumbers.add(fibNumbers.get(i - 1) + fibNumbers.get(i - 2));
        }
        return fibNumbers;
    }
}
