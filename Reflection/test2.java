import lombok.NonNull;

@MyAnnotation(day = 1)
class test2 extends test {
    public test2(){}
    DataContainer container = new DataContainer();
    @Repit(1)
    public void printInt() {
        System.out.println(container.getAnInt());
    }

    @Repit(2)
    public void printStr() {
        System.out.println(container.getString());
    }

    @Repit(3)
    public void printDouble() {
        System.out.println(container.getADouble());
    }

    @Repit(4)
    public void setInt(int value) {
        container.setAnInt(value);
    }
    @Repit(4)
    public void setStr(String value) {
        container.setString(value);
    }
}
