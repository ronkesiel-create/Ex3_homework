package AnimalsCode;

public interface AnimalUI {
    /**
     *
     * @return the maximum speed in meters per second for set animal
     */
    public interface Swimmer {
        void swim();
        double getMaxSwimSpeed();   // in meters per second
    }

    /**
     *
     * @return the maximum height in meters set can fly
     */
    public interface Flyer {
        void fly();
        double getMaxFlightHeight();   // in meters
    }

    /**
     * prints the sound the animal makes
     */
    public void makeSound();


}
