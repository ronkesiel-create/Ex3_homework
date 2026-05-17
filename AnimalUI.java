public class AnimalUI {
    public interface Swimmer {
        void swim();
        double getMaxSwimSpeed();   // לשנייה במטר
    }

    public interface Flyer {
        void fly();
        double getMaxFlightHeight();   // במטרים
    }
}