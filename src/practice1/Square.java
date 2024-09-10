package practice1;
import java.util.*;

public class Square {
    public static void main (String []args){
        String inputValue;
        inputValue = readInput();
        int x = Integer.parseInt(inputValue);

        System.out.println(SquareValue(x));
        System.out.println(Perimeter(x));
        System.out.println(Diagonal(x));

    }

    public static String readInput(){
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue;
    }
    public static int SquareValue(int x){
        return x*x;
    }
    public static int Perimeter(int x){
        return 4*x;
    }
    public static double Diagonal(int x){
        return Math.sqrt(2)*x;
    }
}
