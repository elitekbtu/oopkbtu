package lab1.problem3;
public class Temperature {
    private double temperature;
    private char scale;
// конструктор класса
    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }
// перегрузка метода или перегрузка конструктора

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'F';
    }
    public Temperature(int temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }
    // перегрузка метода или перегрузка конструктора
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
//перегрузка коснтуктора или же пустой конструктор
    public Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getTemperature() {
        return temperature;
    }

    public char getScale() {
        return scale;
    }

    public double toCelcius() {
        if(scale == 'F')
            temperature = 5 * (getTemperature() - 32) / 9;
        return temperature;
    }

    public double toFahrenheit() {
        if(scale == 'C')
            temperature = 9 * (getTemperature() / 5) + 32;
        return temperature;
    }

    public String toString() {
        return "Temperature = " + getTemperature() + "° " + "Scale = " + getScale();
    }
}