package practice3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println();
    }
    public static String[] readInput(){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        return inputText.split(" ");
    }
}
