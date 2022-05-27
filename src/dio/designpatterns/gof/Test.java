package dio.designpatterns.gof;

import dio.designpatterns.gof.singleton.SingletonEager;
import dio.designpatterns.gof.singleton.SingletonLazy;
import dio.designpatterns.gof.singleton.SingletonLazyHolder;
import dio.designpatterns.gof.strategy.*;

public class Test {

    public static void main(String[] args){

        //Singleton
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);

        //Strategy
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
    }
}
