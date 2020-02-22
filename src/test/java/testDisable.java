import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testDisable {

    @Disabled
    @Test
    void testDisabled() {
        System.out.println("disabled");
    }
}
