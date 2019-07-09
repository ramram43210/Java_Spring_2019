package hello;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
       String str = null;
       str.length();
        //latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
