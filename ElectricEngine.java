// The "ElectricEngine" class is another concrete implementation of the Engine interface.
// It provides a different behavior for the same "start" and "accelerate" actions.
public class ElectricEngine implements Engine {
    public ElectricEngine() {
        System.out.println("Electric Engine created.");
    }

    @Override
    public void start() {
        System.out.println("...silently starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Swoosh! Electric acceleration!");
    }
}