package hallowapp;

    import java.util.Scanner;

/*In this method, first we convert the given input string to char array and
then we traverse this array to find white spaces. We concatenate the characters
 which are not the white spaces to String object.
 */

public class RemoveWhiteSpaces
{
    public static void removeWS(String inputString) {
// 1. Using replaceAll() Method
       // System.out.println(inputString.replaceAll("raaa rrrrbuuu uu", '');
// 2. Using without replaceAll() Method
        char[] inputChar = inputString.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (Character ch : inputChar) {
            if (ch != ' ' && ch != '\t') {
                stringBuffer.append(ch);
            }
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        String str = "Core Java jsp servlets jdbc struts hibernate spring";
        removeWS(str);
    }
}