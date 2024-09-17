package practice1;
import java.util.Scanner;

public class Gpa {
    public static void main(String []args){
        int mark = readInput();
        String GpaValue = gpaSystem(mark);
        System.out.println(GpaValue);
    }
    public static int readInput(){
        String inputValue;
        int intValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        intValue = Integer.parseInt(inputValue);
        return intValue;

    }
    public static String gpaSystem(int mark){
        String GpaValue = "0.00";
        if ( mark>100 ){
            return "Invalid value";
        }
        else if (mark <= 100 && mark >= 95) {
            GpaValue = "4.00";
        }
        else if (mark <= 94 && mark >= 90) {
            GpaValue = "3.67";
        }
        else if (mark <= 89 && mark >= 85) {
            GpaValue = "3.33";
        }
        else if (mark <= 84 && mark >= 80) {
            GpaValue = "3.00";
        }
        else if (mark <= 79 && mark >= 75) {
            GpaValue = "2.67";
        }
        else if (mark <= 74 && mark >= 70) {
            GpaValue = "2.33";
        }
        else if (mark <= 69 && mark >= 65) {
            GpaValue = "2.00";
        }
        else if (mark <= 64 && mark >= 60) {
            GpaValue = "1.67";
        }
        else if (mark <= 59 && mark >= 55) {
            GpaValue = "1.33";
        }
        else if (mark <= 54 && mark >= 50) {
            GpaValue = "1.00";
        }
        else if (mark < 50) {
            GpaValue = "0.00";
        }
        else if(mark<0){
            return "Invalid value";
        }

        return GpaValue;
    }
}
