package practice1;
import java.util.*;

public class Palindrome {
    public static void main(String []args){
        String inputValue = readInput();
        String reversed = ReverseString(inputValue);
        if (inputValue.equals(reversed)){
            System.out.println("The word is Palindrome");
        }
        else{
            System.out.println("The word isn't Palindrome");
        }

    }
    public static String readInput() {
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue;
    }
    public static String ReverseString(String Value){
        String reversed = new StringBuilder(Value).reverse().toString();
        return reversed;
    }
}
