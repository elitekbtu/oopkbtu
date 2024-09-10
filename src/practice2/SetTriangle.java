package practice2;

import java.util.Scanner;


public class SetTriangle {
    public static void main(String []args){
        final String pattern = "[*]";
        String inputText = readInput();
        int starsValue = Integer.parseInt(inputText);
        for(int i=1; i<=starsValue; i++){
            System.out.println(Stars(i, pattern));
        }

    }
    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }
    public static String Stars(int length, String pattern){
        String result = pattern.repeat(length);
        return result;
    }

}

