public class TestReflection {
    public static void main(String[] args) throws Exception {
        test Classs = Reflection.create(1, "");
        DataContainer container = Reflection.get(Classs);
        System.out.println(container.getString());
        System.out.println(container.getADouble());
        container.setString("1111");
        container.setADouble(11111);

        Reflection.saveChange(Classs);

        container = Reflection.get(Classs);
        System.out.println(container.getString());
        System.out.println(container.getADouble());
    }
}
