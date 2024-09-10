package practice1;

import java.util.Scanner;

public class BankAccount {
    public static void main(String []args){
        String inputText[] = readInput();
        double balance, percent;
        balance = Integer.parseInt(inputText[0]);
        percent = Integer.parseInt(inputText[1]);
        double result = Deposit(percent, balance);
        System.out.println(result);
    }
    public static String [] readInput() {
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue.split(" ");
    }
    public static double Deposit(double Percent, double Balance){
        return Balance * (1 + Percent/100);
    }

}
