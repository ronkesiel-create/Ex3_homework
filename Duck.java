public class Duck extends Animal implements Flyer,Swimmer{
    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void  MakeSound() {
        System.out.println("Quack");
    }
    public void Swim(){
        System.out.println(this.getName()+" is swimming on water");
    }
    public void Fly(){
        System.out.println(this.getName()+" Flying low");
    }
    public double getMaxSpeed(){
        return 1.5;
    }

    public double getMaxHeight(){
        return 100;
    }
}
