// The "Car" class is the high-level module.
// It is loosely coupled because it depends on the "Engine" interface,
// not on a specific engine type like V8Engine or ElectricEngine.
public class Car {
    private final Engine engine;

    // This constructor uses Dependency Injection to receive an Engine object.
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        engine.accelerate();
    }
}