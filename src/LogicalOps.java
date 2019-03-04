public class LogicalOps {

    public int checkGreatest(int x, int y){

        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    public String checkFastTrack(String s){

        if (s.contains("FastTrack")){
            return "Learning text comparison";
        }
        else {
            return "Got to try some more";
        }
    }

    public void checkTwoEight(int x){

        if ((x >= 2 ) && (x <= 8)){
            System.out.println(x);;
        }
    }

    public String checkFastTrackThree(String s, int x){

        if (s.contains("FastTrack") && (x <= 3)){
            return "FastTrack " + x;
        } else {
            return  x + " " + s;
        }
    }

    public String checkSnowForecast(int x){

        if ((x > 8) || (x == 6)){
            return "The amount of snow this winter was (cm): " + x + "\"";
        } else {
            return "The forecast snow is (cm): " + x + "\"";
        }
    }

    public void checkThreeFour(int x) {

        if ((x > 3) && (x != 4)) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (x == 4) {
            System.out.println("The number is equal to 4");
        } else if (x < 3) {
            System.out.println("The number is lower than 3");
        }
    }

    public void switchZeroNine(int x){

        switch (x){
            case 0:
                System.out.println("0"); break;
            case 1:
                System.out.println("1"); break;
            case 2:
                System.out.println("2"); break;
            case 3:
                System.out.println("3"); break;
            case 4:
                System.out.println("4"); break;
            case 5:
                System.out.println("5"); break;
            case 6:
                System.out.println("6"); break;
            case 7:
                System.out.println("7"); break;
            case 8:
                System.out.println("8"); break;
            case 9:
                System.out.println("9"); break;
            default:
                System.out.println("Not allowed");
        }
    }

    public boolean checkIfEven(int x){

        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfVoteEligible(int x){

        if (x >= 18){
            return true;
        } else {
            return false;
        }
    }

    public int checkGreatest(int x, int y, int z){

        if ((x > y)&& (x > z)){
            return x;
        }
        else if ((y > x) && (y > z)){
            return y;
        }
        else {
            return z;
        }
    }

    public int checkGreatest(int x, int y, int z, int n){

        if ((x > y) && (x > z) && (x > n)){
            return x;
        } else if ((y > x) && (y > z) && (y > n)){
            return  y;
        } else if ((z > x) && (z > y) && (z > n)){
            return z;
        } else {
            return n;
        }
    }

    public int checkMin(int x, int y, int z){

        if ((x < y) && (x < z)){
            return x;
        } else if ((y < x) && (y < z)){
            return y;
        } else {
            return z;
        }
    }

    public int checkMin(int x, int y){

        if (x < y){
            return x;
        } else {
            return y;
        }
    }

    public void printMinAndMax(int x, int y, int z){
        System.out.println(checkMin(x, y, z) + " " + checkGreatest(x, y,z));
    }

    public void orderLowestToHighest(int x, int y){
        System.out.println(checkMin(x, y) + " " + checkGreatest(x, y));
    }

    // count backwards from given number to lower given number

    public void countBackwards(int x, int y){

        if (x > y){
            for (int i = x; i >= y; i--){
                System.out.println(i);
            }
        } else {
            for (int i = y; i >= x; i--){
                System.out.println(i);
            }
        }
    }

    public void printTopDownAsterisk(){

        for (int i = 1; i <= 7; i++){
            for (int j = i; j <= 7; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.

    public void sumAverageHundred(){

        int suma = 0;
        for (int i =1; i <= 100; i++){
            suma = suma + i;
        }
        System.out.println(suma + " " + suma / 100);
    }

    // same but while-do;

    public void whileSumAverageHundred(){

        int suma = 0;
        int i = 1;
        while ( i <= 100){
            suma = suma + i;
            i++;
        }
        System.out.println(suma + " " + suma / 100);
    }

    // same but do-while;

    public void doWhileSumAverageHundred(){

        int suma = 0;
        int i = 1;
        do {
            suma = suma + i;
            i++;
        } while (i <= 100);
        System.out.println(suma + " " + suma / 100);
    }

    //Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable
    // called count to count the numbers in the specified range.

    public void sumAverage(){

        int suma = 0;
        int count = 0;
        for (int i = 111; i <= 8899; i++){
            suma = suma + i;
            count++;
        }
        System.out.println("count = " + count);
        System.out.println("sum = " + suma + " average = " + suma/count);
    }

    //suma nr impare + average; while nr<=100

    public void sumOddAverageHundred(){

        int i = 0;
        int suma = 0;
        while (i <= 100){
            if (i % 2 != 0) {
                suma = suma + i;
            }
            i++;
        }
        System.out.println(suma + " average: " + suma/50);
    }

    //Write a program to sum those numbers from 1 to 100 that are divisible by 7, and compute the average.

    public void sumDivBySevenAverageHundred(){

        int suma = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                suma = suma + i;
                count++;
            }
        }
        System.out.println(suma + " " + suma/count);
    }

    //display the first 20 Fibonacci numbers

    public void printFibonacciTwenty(){

        int x1 = 0;
        int x2 = 1;
        int fib = 0;
        System.out.print(x1 + " " + x2 + " ");
        for (int i = 3; i <= 20; i++){ // primele 2 pozitii: 0, 1 ==> i = 3
            fib = x1 + x2;
            System.out.print(fib + " ");
            x1 = x2;
            x2 = fib;
        }
    }

//    1 to 110, 11 numbers per line.
//    "Coza" 3,
//    "Loza" 5,
//    "Woza" 7,
//    "CozaLoza" 3 and 5, and so on.

    public void cozaWozaLoza(){

        int count = 0;

        for (int i = 1; i <= 110; i++){

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print("CozaLozaWoza ");
                count++;
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.print("CozaLoza ");
                count++;
            } else if (i % 3 == 0 && i % 7 == 0){
                System.out.print("CozaWoza ");
                count++;
            } else if (i % 5 == 0 && i % 7 == 0){
                System.out.print("LozaWoza ");
                count++;
            } else  if (i % 3 == 0){
                System.out.print("Coza ");
                count++;
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
                count++;
            } else if (i % 7 == 0){
                System.out.print("Woza ");
                count++;
            } else {
                System.out.print(i + " ");
                count++;
            }

            if (count == 11){
            System.out.println();
            count = 0;
            }
        }


    }


}
