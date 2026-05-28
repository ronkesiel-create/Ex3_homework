package AnimalsCode;

public class Animal {
   private String name;
   private int age;
   private double weight;

    /**
     * the constructor of the class
     * @param name of the animal
     * @param age in years
     * @param weight in kilos
     */
   public Animal(String name, int age, double weight) {
       this.name = name;
       this.age = age;
       this.weight = weight;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public void setWeight(double weight) {
       this.weight = weight;
   }
   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public double getWeight() {
       return weight;
   }
   public void makeSound() {
       System.out.println("Some generic animal sound");
   }
   @Override
   public String toString() {
       return "name: " + name + ", age: " + age +" years old "+ ", weight: " + weight+" kilos";
   }
}
