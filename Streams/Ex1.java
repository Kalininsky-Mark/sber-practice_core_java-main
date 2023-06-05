
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(Stream.generate(() -> random.nextInt(10, 99)).limit(10).sorted().
                collect(Collectors.toList())); // вывод отстортированных 10 int-ов
        System.out.println(Stream.generate(() -> random.nextInt(10, 99)).limit(10).sorted().
                collect(Collectors.averagingInt(value -> value))); // вывод среднего значения 10-ти случайных int-ов
    }
}
