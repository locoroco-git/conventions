// This is the main class where the program execution begins.
public class Main {
    public static void main(String[] args) {
        // Demonstrate the use of a V8 engine in a car.
        Engine myV8 = new V8Engine();
        Car raceCar = new Car(myV8); // The V8Engine is injected into the Car constructor.
        raceCar.drive();

        System.out.println("\n------------------\n");

        // Demonstrate the use of an electric engine in the same Car class.
        Engine myElectricEngine = new ElectricEngine();
        Car tesla = new Car(myElectricEngine); // The ElectricEngine is injected.
        tesla.drive();
    }
}
