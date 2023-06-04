import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class DataContainer {
    private int anInt;
    private String string;
    private double aDouble;
}
