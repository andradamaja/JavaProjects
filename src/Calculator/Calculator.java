package Calculator;

public class Calculator {

    // Write a Java program to divide two numbers and print on the screen.

    public float divide(float x, float y){

        return x / y;

    }

    public float divide(float x, float y, float z){
        return x / y / z;
    }

    // Write a Java program that takes two numbers as input and displays the product of the two numbers.

    public int multiply(int x, int y) {

        return x * y;

    }

    public int multiply(int x, int y, int z){
        return  x * y * z;
    }

    // Write a Java program that takes three numbers as input to calculate and print the average of the
    // numbers.

    public float returnAverage(float x, float y, float z){

        float sum = x + y + z;

        return (sum / 3);

    }

    public float returnAverage(float x1, float x2, float x3, float x4){

        return (x1 + x2 + x3 + x4) / 4;
    }

    // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
    // of two numbers.

    public int returnSum(int x, int y){

        return x + y;

    }

    public int returnSum(int x, int y, int z){

        return x + y + z;
    }

    public int subtract(int x, int y){

        return x - y;

    }

    public float subtract(float x, float y){

        return x - y;
    }

    public int subtract(int x, int y, int z){

        return x - y - z;
    }

    public int returnRemainder(int x, int y){

        return x % y;

    }

    public float returnRemainder(float x, float y){

        return x % y;
    }

    // Se citeste un numar, sa se afiseze patratul acestuia.

    public int returnSquare(int x){

        return x * x;
    }

    public float returnSquare(float x){

        return x * x;
    }


}
