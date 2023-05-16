import lombok.NonNull;

@MyAnnotation(day = 23)
@MyInheritedAnnotation
public class test {
}
class test2 extends test{
    @Repit(1)
    public void printInt( @NonNull DataContainer container1){
        System.out.println(container1.anInt);
    }
    @Repit(2)
    public void printStr( @NonNull DataContainer container1){
        System.out.println(container1.string);
    }
    @Repit(3)
    public void printDouble( @NonNull DataContainer container1){
        System.out.println(container1.aDouble);
    }
    @Repit(4)
    public void printBool( @NonNull DataContainer container1){
        System.out.println(container1.aBoolean);
    }
}
class test3 extends test{
    @Repit(1)
    public void printInt( @NonNull DataContainer container1){
        System.out.println(container1.anInt);
    }
    @Repit(2)
    public static void printStr( @NonNull DataContainer container1){
        String str = container1.string;
        System.out.println(str);
    }
    @Repit(3)
    public void printDouble( @NonNull DataContainer container1){
        System.out.println(container1.aDouble);
    }
    @Repit(4)
    public void printBool( @NonNull DataContainer container1){
        System.out.println(container1.aBoolean);
    }
}

