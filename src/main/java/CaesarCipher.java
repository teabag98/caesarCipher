//import java.util.List;
//import java.util.ArrayList;

public class CaesarCipher{

   String[] alphabets = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
    public String runCaesarCipher(String InputtedMessage,int shiftBy){
//     boolean filterNumbers = InputtedMessage.matches("[*0-9]");
////
//        if(!filterNumbers){
//         char[] eachLetterSplitted  = InputtedMessage.toCharArray();
////   }

  if(shiftBy > 26){
     shiftBy = shiftBy % 26;
  }
  else if(shiftBy<26){
      shiftBy = (shiftBy%26)+26;
  }
    String encryptedText = "";
   int lengthOfInput = InputtedMessage.length();
    for (int i=0; i<lengthOfInput; i++){
       char eachCharacter = InputtedMessage.charAt(i);
       if(Character.isLetter(eachCharacter)){
        char shiftedCharacter = (char)(eachCharacter+shiftBy);
         if(shiftedCharacter >'z'){
             encryptedText += (char)(shiftedCharacter-(26-shiftBy));

         }
         else()

       }
       else {
     encryptedText += eachCharacter;
       }
    }
     return encryptedText;
    }

}