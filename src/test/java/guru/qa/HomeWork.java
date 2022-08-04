package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {
    @Test
    void firstTest(){
        Assertions.assertTrue((2048 - 15) > (100));
    }
    @Test
    void secondTest(){
        Assertions.assertTrue(500 > 40);
    }
}
