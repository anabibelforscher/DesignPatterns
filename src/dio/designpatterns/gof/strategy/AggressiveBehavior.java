package dio.designpatterns.gof.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Aggressive robot");
    }
}
