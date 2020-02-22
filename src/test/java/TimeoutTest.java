import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TimeoutTest {


    @Test
    void testTimeoutExceeded() {
       assertTimeout(Duration.ofMillis(100), () -> {
           Thread.sleep(2000);
       } );
    }

    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), ()->{
            System.out.println("hi");
        });
    }
}


