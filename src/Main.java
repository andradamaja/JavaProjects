import Calculator.Calculator;
import Calculator.LogicalOps;
import Calculator.Print;
import Calculator.Conversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //Calculator calc = new Calculator();
//
//        System.out.println(calc.divide(32f, 2f));
//
//        System.out.println(calc.divide(200f,10f,2f));
//
//        System.out.println(calc.multiply(3, 2, 6));
//
//        System.out.println(calc.multiply(6, 9));
//
//        System.out.println(calc.returnAverage(2f, 4f, 6f));
//
//        System.out.println(calc.returnAverage(3f,5f,7f,9f));
//
//        System.out.println(calc.returnSum(23, 2));
//
//        System.out.println(calc.returnSum(13, 200, 33));
//
//        System.out.println(calc.subtract(17, 2));
//
//        System.out.println(calc.subtract(32.6f, 12.2f));
//
//        System.out.println(calc.returnRemainder(3, 2));
//
//        System.out.println(calc.returnRemainder(3.2f, 2f));
//
//        System.out.println(calc.returnSquare(7));
//
//        System.out.println(calc.returnSquare(3.2f));
        Conversion conversion = new Conversion();

        LogicalOps logicalOps = new LogicalOps();

        int[] arr = {6, 7, 89, 13};

        logicalOps.copyArray(arr);

    }
}
