package practice1;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;
        String[] inputValues = readInput();
        a = Integer.parseInt(inputValues[0]);
        b = Integer.parseInt(inputValues[1]);
        c = Integer.parseInt(inputValues[2]);
        double discriminantVal = Discriminant(a, b, c);
        String result = Roots(discriminantVal, a, b);
        System.out.println(result);
    }

    public static String [] readInput() {
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue.split(" ");
    }
    public static double Discriminant(int a, int b,  int c){
        return b*b - 4*a*c;
    }
    public static String Roots(double discriminantVal, int a, int b){
        if (discriminantVal<0){
            return "No solution";
        }
        else if (discriminantVal==0){
            return "Equation have only 1 root: " + (-1 * b / 2 * a);
        }
        else{
            return "Equation have 2 roots: " + ((-1 * b + Math.sqrt(discriminantVal)) / 2 * a) + " ; " +  ((-1 * b - Math.sqrt(discriminantVal)) / 2 * a);
        }
    }
}