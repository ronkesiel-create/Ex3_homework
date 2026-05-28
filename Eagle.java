package AnimalsCode;

public class Eagle extends Animal implements Flyer {
    public Eagle(String name, int age, double weight) {
        super(name, age, weight);
    }
    /**
     * print the sound of a eagle
     */
    public void  makeSound() {
        System.out.println("Screech!");
    }
    /**
     * prints the function of Flying
     */
    public void fly(){
        System.out.println(this.getName()+" Flying High to the skies");
    }

    /**
     *
     * @return the maximum speed in meters per second for set animal
     */
    public double getMaxSpeed(){
        return 1.5;
    }
    /**
     *
     * @return the maximum height in meters per second for set animal
     */
    public double getMaxHeight(){
        return 4000;
    }
}
