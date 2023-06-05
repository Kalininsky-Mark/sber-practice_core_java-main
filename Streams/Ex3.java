import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamOfString = builder.add("строка").add("строка").add("строка").add("строка").build();
        Stream<StreamContainer> streamOfStreamContainer = streamOfString.
                map(a -> new StreamContainer(a, random.nextLong(1, 100)));
        Map<Long, String> map = streamOfStreamContainer.collect(Collectors.
                toMap(container -> container.count, container -> container.name));
        System.out.println(map);
    }
}
