import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class CaesarCipherTest {

    @Test
    public void runCaesarCipher() {
      CaesarCipher ifInputIsString = new CaesarCipher();
     assertEquals(false , ifInputIsString.runCaesarCipher("We will.."));



    }
}