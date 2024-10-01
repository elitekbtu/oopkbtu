package practice2;

public class Timer {
    public static void main(String[] args) {

        Time t = new Time(23, 5, 7);

        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);

        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}


class Time{
    private int hour,second,minute;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour,int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else{
            System.out.println("Wrong values of time");
        }
    }
    public String toUniversal(){
        return this.hour+":" + this.minute + ":" + this.second;
    }
    public String toStandard(){
        String result = "";
        if (this.hour>12){
            result += this.hour%12+":";
        }
        return result + this.minute+ ":" + this.second;
    }
    public void add(Time otherTime) {
        int newSecond = this.second + otherTime.second;
        int newMinute = this.minute + otherTime.minute + newSecond / 60;
        int newHour = this.hour + otherTime.hour + newMinute / 60;

        this.second = newSecond % 60;
        this.minute = newMinute % 60;
        this.hour = newHour % 24;
    }
}