/**
 * Created by Lenovo on 12.07.2017.
 */
public class Dog {
    private String name; // to wymagne jest
    private int age;
    private String species;
    private boolean isVac;

    private Dog() {

    }

    public class Builder {
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
