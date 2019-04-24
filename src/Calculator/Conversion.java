package Calculator;

public class Conversion {

    // Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this
    // formula: C = 5/9 * (F-32)

    public float convertFahrenheitToCelsius(float x){

        return 5f / 9f * (x - 32);

    }

    // Write a Java program that reads a number in inches, converts it to meters. ( one inch is
    // 0.0254 meters)

    public float convertInchToMeter(float x){

        return x * 0.0254f;

    }

    // Write a Java program that takes the distance (in meters)
    //and time from the user(as three numbers: hours, minutes,
    //seconds), and displays the speed, in meters per second, kilometers
    //per hour and miles per hour (hint: 1 mile = 1609 meters)

    public void displaySpeed(float distance, float hours, float minutes, float seconds){

        float s = convertMinToSec(convertHoursToMin(hours)) + convertMinToSec(minutes) + seconds;

        float k = convertMetersToKm(distance);

        float h = hours + convertMinToHours(minutes) + convertMinToHours(convertSecToMin(seconds));

        float m = convertMetersToMiles(distance);

        System.out.println("The speed is:\n"
                            + (distance / s) + "m/s\n"
                            + (k / h) + " km/h\n"
                            + (m / h) + " m/h");
    }

    public float convertMinToSec(float x){

        return x * 60f;

    }

    public float convertSecToMin(float x){

        return x / 60f;

    }

    public float convertHoursToMin(float x){

        return x * 60f;

    }

    public float convertMinToHours(float x){

        return x / 60f;

    }

    public float convertMetersToKm(float x){

        return x * 0.001f;

    }

    public float convertMetersToMiles(float x){

        return x / 1609f;

    }

    public float speed(float d, float t){

        return d / t;

    }
}
