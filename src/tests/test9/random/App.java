package tests.test9.random;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    static private boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Supplier<IntStream> rands =
            () -> new Random().ints(1000, 10, 10000);

        // 1. запрос со сбором данных в коллекцию
        List<Integer> nums = rands.get().boxed().toList();

        // 2. запрос на подсчет количества (например, простых чисел)
        long count = rands.get().filter(App::isPrime).count();

        // 3. запрос, где применяем редукцию множества значений к одному
        OptionalInt sum = rands.get().reduce(Integer::sum);

        // 4. просто вывод на консоль
        rands.get().limit(5).forEach(e -> System.out.printf("rands forEach: %s\n", e));

        // 5. запрос с формированием результата в карту
        Map<Integer, Integer> map =
            rands.get().boxed().distinct().limit(10).collect(Collectors.toMap((v) -> v, (v) -> v));

        System.out.printf("Keys:   %s\n", map.keySet());
        System.out.printf("Values: %s\n", map.values());
    }
}
