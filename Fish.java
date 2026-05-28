package AnimalsCode;

public class Fish extends Animal implements Swimmer {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    /**
     * print the sound of a fish
     */
    public void  makeSound() {
        System.out.println("Blub blub");
    }
    /**
     * prints the function of swimming on water
     */
    public void swim(){
        System.out.println(this.getName()+" is swimming on water");
    }

    /**
     *
     * @return the maximum speed in meters per second for set animal
     */
    public double getMaxSpeed(){
        return 3.0;
    }
}
