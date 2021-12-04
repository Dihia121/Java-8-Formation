package java_formation.Lambdas;

@FunctionalInterface
public interface TestInterface {

    public void add();

    default String sayHi() {
        return "Hi";
    }

    static boolean isTrue() {
        return true;
    }
}
