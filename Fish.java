public class Fish extends Animal implements Swimmer{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void  makeSound() {
        System.out.println("Blub blub");
    }
    public void swim(){
        System.out.println(this.getName()+" is swimming on water");
    }

    public double getMaxSpeed(){
        return 3.0;
    }
}
