import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


public class ex3_4 {
    public static void main(String args[]){
        Sounding beeSound = new BeeSound();
        Sounding bearSound = new BearSound();
        Sounding catSound = new CatSound();
        Sounding dogSound = new DogSound();
        Sounding AlpacaSound = new AlpacaSound() {
            @Override
            public void sound() {
                System.out.println("scream");
            }
        };
        String sound = "aaaaaaaaaaaaa";
        Object object = System.out;
        List<Sounding> list = List.of(bearSound, beeSound, catSound, dogSound, AlpacaSound,
                () -> {System.out.println(sound);}, System.out::println, System.out::close);
        list.forEach(Sounding::sound);
    }

}
