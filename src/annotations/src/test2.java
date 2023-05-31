import lombok.NonNull;

class test2 extends test {
    @Repit(1)
    public void printInt(@NonNull DataContainer container1) {
        System.out.println(container1.anInt);
    }

    @Repit(2)
    public void printStr(@NonNull DataContainer container1) {
        System.out.println(container1.string);
    }

    @Repit(3)
    public void printDouble(@NonNull DataContainer container1) {
        System.out.println(container1.aDouble);
    }

    @Repit(4)
    public void printBool(@NonNull DataContainer container1) {
        System.out.println(container1.aBoolean);
    }
}
