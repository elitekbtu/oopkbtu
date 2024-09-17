package practice1;
import java.util.*;


public class Box {
    public static void main(String []args){
        String Name = readInput();
        String result = MakeBox(Name);
        System.out.println(result);
    }

    public static String readInput(){
        String inputText;
        Scanner scanner = new Scanner(System.in);
        inputText = scanner.nextLine();
        return inputText;
    }
    public static String MakeBox(String value){
        int lengthName = value.length();
        System.out.println("+" + "-".repeat(lengthName) + "+");
        System.out.println("|" + value + "|");
        return "+" + "-".repeat(lengthName) + "+";
    }
}
