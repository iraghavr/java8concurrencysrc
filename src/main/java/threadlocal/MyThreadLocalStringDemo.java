package threadlocal;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class MyThreadLocalStringDemo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>(); // threadLocal作为类变量

    private String getString() {
        return threadLocal.get();
    }

    private void setString(String string) {
        threadLocal.set(string);
    }

    public static void main(String[] args) {
        int threads = 9;
        MyThreadLocalStringDemo demo = new MyThreadLocalStringDemo();
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            Thread thread = new Thread(() -> {
                demo.setString(Thread.currentThread().getName());
                System.out.println(demo.getString());
                countDownLatch.countDown();
            }, "--" + i);

            thread.start();
        }
    }
}
