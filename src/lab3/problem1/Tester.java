package lab3.problem1;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter bank balance: ");
        Scanner scanner = new Scanner(System.in);
        Bank bs = new Bank(scanner.nextInt());

        if (bs.extractBalance(100)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }
}
