public class Calculator {

    public float division(float x, float y){

        return x / y;

    }

    public int product(int x, int y) {

        return x * y;

    }

    public float average(float x, float y, float z){

        float sum = x + y + z;

        return (sum / 3);

    }

    public int sum(int x, int y){

        return x + y;

    }

    public int subtract(int x, int y){

        return x - y;

    }

    public int divide(int x, int y){

        return x / y;

    }

    public int remainder(int x, int y){

        int div = divide(x, y);

        int prod = product(div, y);

        return subtract(x, prod);

    }

    public int square(int x){
        return x * x;
    }


}
