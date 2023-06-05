import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        Map<String, List<StreamContainer>> map =Map.of(
                "BossesLK",List.of(
                        new StreamContainer("Lich King", random.nextLong(1, 10)),
                        new StreamContainer("Sindragosa", random.nextLong(1, 10)),
                        new StreamContainer("Professor Merzocid", random.nextLong(1, 10))),
                "BossesBK",List.of(
                new StreamContainer("Gruul", random.nextLong(10, 20)),
                new StreamContainer("Lady Vaish", random.nextLong(10, 20)),
                new StreamContainer("Celtas the Solar Wanderer", random.nextLong(10, 20))));
        Stream <StreamContainer> stream = map.values().stream().flatMap(List::stream);
        System.out.println(stream.collect(Collectors.toList()));
    }
}
