public class Fish extends Animal implements Flyer,Swimmer{
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void  MakeSound() {
        System.out.println("Blub blub");
    }
    public void Swim(){
        System.out.println(this.getName()+" is swimming on water");
    }

    public double getMaxSpeed(){
        return 1.5;
    }

    public double getMaxHeight(){
        return 100;
    }
}
