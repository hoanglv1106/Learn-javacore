package week2.Multithreading;
//Sử dụng ExecutorService để chạy 3 tác vụ song song.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Example2 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tác vụ 1 - Lần " + (i+1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tác vụ 2 - Lần " + (i+1));
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tác vụ 3 - Lần " + (i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        ExecutorService executors = Executors.newFixedThreadPool(3);
        executors.execute(task1);
        executors.execute(task2);
        executors.execute(task3);
        executors.shutdown();





    }


}
