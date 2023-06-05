public class StreamContainer {
    String name;
    Long count;
    public StreamContainer(String name, Long count){
        this.count = count;
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " (" + count + ")";
    }
}
