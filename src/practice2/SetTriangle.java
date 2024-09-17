package practice2;

import java.util.Scanner;


public class SetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.next());
        StarTriangle starTriangle = new StarTriangle(lenght);
        System.out.println(starTriangle.toString());
    }
}
class StarTriangle{
    private int length;
    private String pattern = "[*]";
    private String result="";
    public StarTriangle(int length){
        this.length = length;
    }
    public String toString(){
        for(int i=1; i<=length; i++){
            result += pattern.repeat(i)+'\n';
        }
        return result;
    }

}
