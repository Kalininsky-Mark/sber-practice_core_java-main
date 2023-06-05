
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(Stream.generate(() -> random.nextInt(10, 99)).limit(10).sorted().
                collect(Collectors.toList())); // ����� ���������������� 10 int-��
        System.out.println(Stream.generate(() -> random.nextInt(10, 99)).limit(10).sorted().
                collect(Collectors.averagingInt(value -> value))); // ����� �������� �������� 10-�� ��������� int-��
    }
}
