import builder.Dog;

/**
 * Created by Lenovo on 12.07.2017.
 */
public class Main {



    public static void main(String[] args) {
       new Main();
    }

    public Main() {
        Dog dog = new Dog.Builder("Aleks")
                .setAge(5)
                .setSpecies("Ssak")
                .setVac(true)
                .build();

        System.out.println(dog.getAge());

    }



}
