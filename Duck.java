package AnimalsCode;

public class Duck extends Animal implements Flyer, Swimmer {
    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }
    /**
     * print the sound of a duck
     */
    public void  makeSound() {
        System.out.println("Quack");
    }

    /**
     * prints the function of swimming on water
     */
    public void swim(){
        System.out.println(this.getName()+" is swimming on water");
    }
    /**
     * prints the function of Flying
     */
    public void fly(){
        System.out.println(this.getName()+" Flying low");
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
        return 100;
    }
}
