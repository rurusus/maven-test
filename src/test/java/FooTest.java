import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FooTest {

    @Test
    public void testBar() {
        Foo f = new Foo();
        assertEquals(f.bar(), "Hello world!");
    }
}