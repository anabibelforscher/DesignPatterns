package dio.designpatterns.gof.strategy;

public class NormalBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Robot walk...");
    }
}
