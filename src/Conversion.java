public class Conversion {

    public float convertFahrenheitToCelsius(float x){

        return 5f / 9f * (x - 32);

    }

    public float convertInchToMeter(float x){

        return x * 0.0254f;

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
