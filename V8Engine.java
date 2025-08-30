// The "V8Engine" class is a concrete implementation of the Engine interface.
// It represents one of the specific "strategies" or behaviors.
class V8Engine implements Engine {
    public V8Engine() {
        System.out.println("V8 Engine created.");
    }

    @Override
    public void start() {
        System.out.println("Vroom! Vroom!");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating with a roar...");
    }
}