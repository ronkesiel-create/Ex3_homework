import jdk.dynalink.beans.StaticClass;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        System.out.println("remember that the weight is in kilos");
        System.out.println();
        animals[0] = new Lion("Lion", 2, 70);
        animals[1] = new Eagle("Eagle", 3, 6);
        animals[2] = new Fish("Fish", 4, 30);
        animals[3] = new Duck("Duck1", 5, 4);
        animals[4] = new Duck("Duck2", 1, 3);
        double topSpeed = 0;
        int index = 0;
        for (int i = 0; i<animals.length; i++) {
            animals[i].makeSound();

        }
        for (int i = 0; i<animals.length; i++) {
            if(animals[i] instanceof Swimmer) {
                ((Swimmer) animals[i]).swim();
                if ( ((Swimmer) animals[i]).getMaxSpeed() > topSpeed ) {
                    topSpeed = ((Swimmer) animals[i]).getMaxSpeed();
                    index = i;
                }
            }
            if(animals[i] instanceof Flyer) {
                ((Flyer) animals[i]).fly();
            }
        }
        System.out.println("The fastest swimmer within the Animal group is: " +animals[index]+" and its top speed is: " + topSpeed);
    }
}
