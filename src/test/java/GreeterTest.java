package hello;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.internal.matchers.StringContains;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), StringContains.containsString("Hello"));
    }

}
