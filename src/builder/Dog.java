package builder;

/**
 * Created by Lenovo on 12.07.2017.
 */
public class Dog {
    private String name; // to wymagne jest
    private int age;
    private String species;
    private boolean isVac;

    private Dog(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.species = builder.species;
        this.isVac = builder.isVac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isVac() {
        return isVac;
    }

    public void setVac(boolean vac) {
        isVac = vac;
    }

    public static class Builder {
        private String name; // to wymagne jest
        private int age;
        private String species;
        private boolean isVac;

        public Builder(String name){
            this.name = name;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setSpecies(String species){
            this.species = species;
            return this;
        }

        public Builder setVac(boolean vac){
            this.isVac = vac;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }
    }
}
