import com.example.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;



public class HelloTest {
    @Test
    public void testMessage(){
        assertEquals("Hello from Jenkins!!", HelloWorld.Message());
    }
}
