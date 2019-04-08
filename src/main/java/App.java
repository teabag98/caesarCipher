import java.io.Console;





public class App {
    public static void main(String[] args) {
        Console myConsole= System.console();
        System.out.println("Enter your message");
        CaesarCipher myCaesarCipher = new CaesarCipher();
        String myInputtedString = myConsole.readLine();

       String encryptedResult = myCaesarCipher.runCaesarCipher(myInputtedString, 3);
        System.out.println(encryptedResult);
    }
}