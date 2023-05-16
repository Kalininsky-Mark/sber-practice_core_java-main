import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
public @interface MyAnnotation2 {
    int clocks();
    int priority();
    String description();

}
@interface MyAnnotations {
    MyAnnotation2[] value();
}