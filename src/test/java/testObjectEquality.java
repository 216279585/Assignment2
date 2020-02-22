import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testObjectEquality {

    BankAccount user1 = new BankAccount("John", 50);
    BankAccount user2 = new BankAccount("John", 50);


    boolean actual = user1.equals(user2);
    boolean actual2 = user1 == user2;



    //object equality checks if the values are the same
    @Test
    void testEquality() {
       assertTrue(actual);
    }


    //Fails because it checks identification and not equality between values.
    //The two user objects are in different memory locations, so they are not exactly the same.
    //Identification - checks to see if it's an exact copy
    @Test
    void testEquality2() {
        assertTrue(actual2);
    }


}
