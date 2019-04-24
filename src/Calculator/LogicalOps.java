package Calculator;

public class LogicalOps {

    // Given two numbers, see which one is the greatest and print it

    public int checkGreatest(int x, int y){

        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    // Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
    // “Got to try some more”

    public String checkInputFastTrack(String s){

        if (s.contains("FastTrack")){
            return "Learning text comparison";
        }
        else {
            return "Got to try some more";
        }
    }

    // Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the
    //number

    public void checkTwoEight(int x){

        if ((x >= 2 ) && (x <= 8)){
            System.out.println(x);;
        }
    }

    // Given a text input and a number input, if the text is equal to “FastTrack” AND the
    // number is equal to or lower than 3, print the text and the number. If the text is not
    // “FastTrack” AND the number is equal to or higher than 4, print the number and the
    // text, in this order.

    public String checkFastTrackThree(String s, int x){

        if (s.contains("FastTrack") && (x <= 3)){
            return "FastTrack " + x;
        } else {
            return  x + " " + s;
        }
    }

    // Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
    // this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”

    public String checkSnowForecast(int x){

        if ((x > 8) || (x == 6)){
            return "The amount of snow this winter was (cm): " + x + "\"";
        } else {
            return "The forecast snow is (cm): " + x + "\"";
        }
    }

    // Given a number input, if the number is greater than 3 but not equal to 4, print “The
    // number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
    // ”The number is equal to 4”. Else if the number is lower than 3 print “The number is
    // lower than 3”

    public void checkThreeFour(int x) {

        if ((x > 3) && (x != 4)) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (x == 4) {
            System.out.println("The number is equal to 4");
        } else if (x < 3) {
            System.out.println("The number is lower than 3");
        }
    }

    // If the user pressed number keys( from 0 to 9), the program will tell the number that is
    // pressed, otherwise, program will show "Not allowed”. (use a switch case for this)

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

    // Write a Java program to determine whether an input number is an even number

    public boolean checkIfEvenInput(int x){

        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    // Write Java program to allow the user to input his/her age. Then the program will show
    // if the person is eligible to vote. A person who is eligible to vote must be older than or
    // equal to 18 years old.

    public boolean checkIfVoteEligible(int x){

        if (x >= 18){
            return true;
        } else {
            return false;
        }
    }

    // Find the greatest number from 3 given numbers.

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

    // Se citesc trei numere, sa se afiseze minimul si maximul.

    public void printMinAndMax(int x, int y, int z){
        System.out.println(checkMin(x, y, z) + " " + checkGreatest(x, y,z));
    }

    // Se citesc doua numere, sa se ordoneze crescator.

    public void orderLowestToHighest(int x, int y){
        System.out.println(checkMin(x, y) + " " + checkGreatest(x, y));
    }

    // Given a number, while the number is equal to or lower than 100, print the number.

    public void countToHundred(int x){

        for (int i = x; i < 100; i++){
            System.out.println(i);;
        }
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

    // Write a Java program by using two for loops to produce the output shown below:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*

    public void printTopDownAsterisk(){

        for (int i = 1; i <= 7; i++){
            for (int j = i; j <= 7; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute
    // and display the average.

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

    //Write a program to sum those numbers from 1 to 100 that are divisible by 7, and compute
    // the average.

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
        int fib;
        System.out.print(x1 + " " + x2 + " ");
        for (int i = 2; i < 20; i++){ // primele 2 pozitii: 0, 1 ==> i = 2
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

    // Define and write the values of an array indices, so that the values of the arrays should
    // start from 1 and count to 100; Print the progress in the console;

    public int[] printArrayFromOneToHundred(){
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        return arr;
    }

    // Write a Java program to calculate the average value of array elements.

    public float getAverageOfArray(int[] arr){

        float sum = 0f;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        return sum / arr.length;
    }

    // Write a Java program to test if an array contains a specific value.

    public boolean checkIfArrayContainsValue(int[] arr, int x){

        boolean contain = false;

        for (int i: arr){
            if (i == x){
                contain = true;
            }
        }

        return contain;
    }

    // Write a Java program to find the index of an array element.

    public void findIndexOfArrayElement(int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                System.out.println(i);
            }
        }
    }

    //6.Write a Java program to remove a specific element from an array.

    //7.Write a Java program to find the second smallest element in an array.

    public void findSecondSmallestInArray(int[] arr){

    }

    // Write a Java program to copy an array by iterating the array

    public int[] copyArray(int[] arr){

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }

        return arr2; /// REVIEW

    }

//    9. Write a Java program to insert an element (specific position) into an array.
//            10. Write a Java program to find the maximum and minimum value of an array.
//        11. Write a Java program to reverse an array of integer values.
//    12. Write a Java program to find the duplicate values of an array of integer values.
//    13. Write a Java program to find the duplicate values of an array of string values
//    14. Write a Java program to find the common elements between two arrays (string values).

}
