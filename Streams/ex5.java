import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex5 {
    public static void main(String[] args) {
        String binaryString = "1111111111";
        System.out.println(binaryString.chars().mapToObj(ch -> ch == '1').collect(Collectors.toList()));
        Stream<Boolean> booleanStream = binaryString.chars().mapToObj(ch -> ch == '1');
        boolean result= booleanStream.reduce(true, (id, value) -> id & value);
        System.out.println(result);
        String binaryString2 = "1010101011";
        System.out.println(binaryString2.chars().mapToObj(ch -> ch == '1').collect(Collectors.toList()));
        Stream<Boolean> booleanStream2 = binaryString2.chars().mapToObj(ch -> ch == '1');
        boolean result2= booleanStream2.reduce(true, (id2, value2) -> id2 & value2);
        System.out.println(result2);
    }
}
