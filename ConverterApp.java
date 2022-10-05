package October01.converter;

public class ConverterApp {

    public static void main(String[] args) {

        double temperature = 23.5;
        System.out.println("The Celsius temperature is " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("The Kelvin temperature is " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("The Fahrenheit temperature is " + new FahrenheitConverter().getConvertedValue(temperature));
    }

}

interface Converter {

    double getConvertedValue(double temperature);
}


class CelsiusConverter implements Converter {
    double temperature;

    CelsiusConverter() {
    }
    @Override
    public double getConvertedValue(double temperature) {
        return temperature;
    }
}

class KelvinConverter implements Converter {
    double temperature;

    KelvinConverter() {

    }

    @Override
    public double getConvertedValue(double temperature) {
        return temperature + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    double temperature;

    FahrenheitConverter() {

    }

    @Override
    public double getConvertedValue(double temperature) {
        return (Math.round((temperature * 1.8 + 32) * 100)/100.0);
    }
}









