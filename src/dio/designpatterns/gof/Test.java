package dio.designpatterns.gof;

public class Test {

    public static void main(String[] args){
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
    }
}
