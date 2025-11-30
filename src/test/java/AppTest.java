import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.app;
public class AppTest {
    @Test
    void testHello() {

        assertEquals("Hello, World!", app.hello());
    }
}
