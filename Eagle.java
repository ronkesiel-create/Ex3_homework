public class Eagle extends Animal implements Flyer{
    public Eagle(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void  makeSound() {
        System.out.println("Screech!");
    }

    public void fly(){
        System.out.println(this.getName()+" Flying High to the skies");
    }
    public double getMaxSpeed(){
        return 1.5;
    }

    public double getMaxHeight(){
        return 4000;
    }
}
