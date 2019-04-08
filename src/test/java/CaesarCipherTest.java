import org.junit.*;
import static org.junit.Assert.*;


public class CaesarCipherTest {

    @Test
    public void runCaesarCipher() {
      CaesarCipher ifInputIsString = new CaesarCipher();
     assertEquals("def" , ifInputIsString.runCaesarCipher("abc", 3));



    }
}