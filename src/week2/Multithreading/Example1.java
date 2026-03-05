package week2.Multithreading;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Tạo 2 thread song song: 1 thread in số chẵn, 1 in số lẻ từ 1–20.
public class Example1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(()->{
            for (int i = 1; i <= 20; i++) {
                if (i%2 == 0) {
                    System.out.println("Số chẵn: " + i);
                }
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    break;
                }
            }
        });
        
        executor.execute(()->{
            for (int i = 1; i <=20 ; i++) {
                if (i%2 != 0) {
                    System.out.println("Số lẻ: " + i);
                }
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    break;
                }
            }

        });

        executor.shutdown();

    }
}
