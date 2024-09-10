package practice2;

import java.util.Scanner;

public class Clock {
    public static  void main(String []args){
        String Values[] = readInput();

        Timer timer = new Timer<>(Integer.parseInt(Values[0]), Integer.parseInt(Values[1]), Integer.parseInt(Values[2]));

        System.out.println(timer.getTime());

        String newValues[] = readInput();
        System.out.println(timer.changeTime(Integer.parseInt(newValues[0]), Integer.parseInt(newValues[1]), Integer.parseInt(newValues[2])));

        int hour = readOnlyInt();
        System.out.println(timer.changeHour(hour));

        int minute = readOnlyInt();
        System.out.println(timer.changeMinite(minute));

        int second = readOnlyInt();
        System.out.println(timer.changeSecond(second));


    }

    public static String[] readInput() {
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue.split(" ");
    }
    public static int readOnlyInt(){
        Scanner scanner = new Scanner(System.in);
        int inputValue = Integer.parseInt(scanner.next());
        return inputValue;
    }
}


class Timer<Hours, Minute, Second> {
    private int Hours;
    private int Minute;
    private int Second;

    public Timer(int hours, int minutes, int seconds) {
        this.Hours = hours;
        this.Minute = minutes;
        this.Second = seconds;
    }

    public String getTime() {
        return "Now time : " + this.Hours + ":" + this.Minute+ ":" + this.Second;
    }
    public String changeTime(int hours, int minutes, int seconds) {
        this.Hours = hours;
        this.Minute = minutes;
        this.Second = seconds;
        return "Now time changed to : " + this.Hours + ":" + this.Minute + ":" + this.Second;
    }
    public String changeHour(int hours) {
        this.Hours = hours;
        return "Now time changed to : " + this.Hours + ":" + this.Minute + ":" + this.Second;
    }
    public String changeMinite(int minutes) {
        this.Minute = minutes;

        return "Now time changed to : " + this.Hours + ":" + this.Minute + ":" + this.Second;
    }
    public String changeSecond(int seconds) {
        this.Second = seconds;
        return "Now time changed to : " + this.Hours + ":" + this.Minute + ":" + this.Second;
    }

}
