// The "Engine" interface defines the contract for all types of engines.
// This is the core of the Dependency Inversion Principle, as the Car class
// depends on this abstraction, not a concrete implementation.
public interface Engine {
    void start();
    void accelerate();
}
