package dio.designpatterns.gof.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Robot defense");
    }
}
