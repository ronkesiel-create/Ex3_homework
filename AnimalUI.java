public interface AnimalUI {
    public interface Swimmer {
        void swim();
        double getMaxSwimSpeed();   // לשנייה במטר
    }

    public interface Flyer {
        void fly();
        double getMaxFlightHeight();   // במטרים
    }

    /**
     * prints the sound the animal makes
     */
    public void makeSound();


}
