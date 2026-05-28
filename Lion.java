package AnimalsCode;

public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    /**
     * print the sound of a lion
     */
    public void  makeSound() {
        System.out.println("Roar!!!");
    }
}
