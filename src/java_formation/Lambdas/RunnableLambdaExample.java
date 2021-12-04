package java_formation.Lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };
        new Thread(t1).start();

        //After help of runnalble
        Runnable t2 = () -> {System.out.println("Thread 2");};
        new Thread(t2).start();

        new Thread(() -> System.out.println("Thread5")).start();
    }
}
