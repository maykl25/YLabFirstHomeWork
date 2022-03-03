import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;

public class FibonacciWithClass {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(reader.readLine());
        Fibonachi fib = new Fibonachi();
        HashMap<Integer, Long> numbers = fib.memoryFibonacci(number);
        System.out.println(numbers);
    }
}

class Fibonachi {

    public HashMap<Integer, Long> table = new HashMap<>();

    public HashMap<Integer, Long> memoryFibonacci(int n) {
        table.put(0, 0L);
        table.put(1, 1L);
        for (int i = 2; i < n; i++) {
            table.put(i, table.get(i-1) + table.get(i - 2));
        }
        return table;
    }
}
