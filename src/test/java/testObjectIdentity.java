import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testObjectIdentity {
    BankAccount user1 = new BankAccount("John", 50);
    BankAccount user2 = new BankAccount("John", 50);
    BankAccount user3 = user1;

    boolean actualFalse = user1 == user2;
    boolean actualTrue = user1 == user3;

    //false because these two objects are in different portions of memory
    @Test
    void testObjectIdentificationFalse() {
        assertFalse(actualFalse);
    }

    //true because it's an exact copy of user1
    @Test
    void testObjectIdentificationTrue() {
        assertTrue(actualTrue);
    }

}
