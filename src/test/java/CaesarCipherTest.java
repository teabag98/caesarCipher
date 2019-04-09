import org.junit.*;
import static org.junit.Assert.*;


public class CaesarCipherTest {

    @Test
    public void runCaesarCipher() {
      CaesarCipher ifInputIsString = new CaesarCipher();
     assertEquals("def" , ifInputIsString.runCaesarCipher("abc", 3));
        assertEquals("eodfn" , ifInputIsString.runCaesarCipher("black", 3));
        assertEquals("prulqjd vfkrro" , ifInputIsString.runCaesarCipher("moringa school", 3));
        //test for caps
        assertEquals("ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ" , ifInputIsString.runCaesarCipher("LAZY BROWN FOX JUMPS OVER A LAZY DOG", 3));



    }
}