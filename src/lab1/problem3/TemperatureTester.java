package lab1.problem3;

public class TemperatureTester {

    public static void main(String[] args) {
        Temperature t = new Temperature(150, 'F');
        Temperature t1 = new Temperature(150);
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
    }
}