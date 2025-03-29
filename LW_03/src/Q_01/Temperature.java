package Q_01;

public class Temperature {
    private double celsius;

    public Temperature(){
        this.celsius = 0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double  toFahrenheit(){
        return (celsius * (double) 9 / 5 + 32);
    }

    public void setFahrenheit(double fahrenheit){
        this.celsius = (fahrenheit - 32) * (double) 5 / 9;
    }
}
