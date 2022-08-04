package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {
    @Test
    void firstTest(){
        Assertions.assertTrue((2048 - 15) > (95));
    }
    @Test
    void secondTest (){
        Assertions.assertFalse((850-50) < 200);
    }
}
