
public class CaesarCipher{

    public String runCaesarCipher(String inputtedMessage, int shift){
          StringBuilder encryptedMessage = new StringBuilder(inputtedMessage);
             String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
               String alphabet2 = alphabet.toLowerCase();
                String upperCaseInput = alphabet.substring(shift) + alphabet.substring(0, shift);
                for (int i = 0; i < encryptedMessage.length(); i++) {
                        char currentCharacter = encryptedMessage.charAt(i);
                        int index = alphabet.indexOf(currentCharacter);
                        if (index != -1) {
                char newCharacter = upperCaseInput.charAt(index);
                encryptedMessage.setCharAt(i, newCharacter);
            }            index = alphabet2.indexOf(currentCharacter);
            if (index != -1) {
                String lowercaseInput = upperCaseInput.toLowerCase();
                char newCharacter = lowercaseInput .charAt(index);
                encryptedMessage.setCharAt(i, newCharacter);
            }        }
        return encryptedMessage.toString();
    }
}