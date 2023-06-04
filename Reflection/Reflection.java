import lombok.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Reflection {
    private static final List<Class<? extends test>> list = List.of(test2.class, test3.class);
    private static Class<? extends test> findByAnnotation(int day) {
        for (Class<? extends test> classs : list){
            if (classs.getAnnotation(MyAnnotation.class).day() == day){
                return classs;
            }
        }
        return null;
    }


    static test create(int day, String description) throws Exception {
        Class<? extends test> classs = findByAnnotation(day);
        assert classs != null;
        test instance = classs.getConstructor().newInstance();
        Method setStr = classs.getMethod("setStr", String.class);
        setStr.invoke(instance, description);
        return instance;
    }
    public static void saveChange(@NonNull test instance) throws Exception {
        Method set = instance.getClass().getMethod("setStr", String.class);
        Repit[] Repits = set.getAnnotationsByType(Repit.class);

        for (Repit description : Repits) {
            set.invoke(instance, description.descriptions());
        }
    }
    public static DataContainer get(@NonNull test instance) throws Exception {
        Field container = instance.getClass().getDeclaredField("container");

        container.setAccessible(true);
        return (DataContainer) container.get(instance);
    }
}
