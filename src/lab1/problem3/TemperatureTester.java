package lab1.problem3;

public class TemperatureTester {

    public static void main(String[] args) {
        Temperature t = new Temperature(150, 'F');
        Temperature t1 = new Temperature(150, 'C');
        Temperature t3 = new Temperature(165.3);

        System.out.println(t.toString());

        if(t.getScale() == 'C') {
            System.out.print(t.toFahrenheit());
            System.out.print("°F");
        }
        else {
            System.out.print(t.toCelcius());
            System.out.print("°C");
        }
        System.out.println();
        System.out.println();

        System.out.println(t1.toString());

        if(t1.getScale() == 'C') {
            System.out.print(t1.toFahrenheit());
            System.out.print("°F");
        }
        else {
            System.out.print(t1.toCelcius());
            System.out.print("°C");

        }

        System.out.println();
        System.out.println();

        System.out.println(t3.toString());

        if(t3.getScale() == 'C') {
            System.out.print(t3.toFahrenheit());
            System.out.print("°F");
        }
        else {
            System.out.print(t3.toCelcius());
            System.out.print("°C");
        }
    }
}