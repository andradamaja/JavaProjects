package Calculator;

public class Print {

    // Write a Java program to print 'Hello' on screen and then print your name on a separate line

    public void printHelloName() {

        System.out.println("Hello \n Andrada");

    }

    // Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the sum of the two numbers

    public void printSumOfSevenAndEight() {

        System.out.println("The addition of 7 and 8 is: " + (7 + 8));

    }

//     Write a Java program to print the result of the following operations:
//            a. -5 + 8 * 6
//            b. (55+9) % 9
//            c. 20 + -3*5 / 8
//            d. 5 + 15 / 3 * 2 - 8 % 3

    public void printOps(){

        byte a = -5 + 8 * 6;

        byte b = (55 + 9) % 9;

        float c = 20 + -3f * 5 / 8;

        byte d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("a. " + a + ";\n" + "b. " + b + ";\n" + "c. " + c + ";\n" + "d. " + d + ";");

    }



    public void printJava(){

        System.out.println("   J   a  v     v  a\n" +
                           "   J  a a  v   v  a a\n" +
                           "J  J aaaaa  V V  aaaaa\n" +
                           " JJ a     a  V  a     a\n");


    }

    // Write a Java program to display the following pattern:

    public void printPattern(){

        System.out.println("  +\"\"\"\"\"+\n" +

                           "[ | o o | ]\n" +

                           "  |  ^  |  \n" +

                           "  | '_' |  \n" +

                           "  +-----+\n");

    }

    // Se citeste un numar, sa se afiseze valoarea numarului citit.

    public void printNumber(int x){

        System.out.println(x);

    }

    /// pattern - - - (10 pe 10)

    public void printHyphenArray(){

        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = "- ";
        }

        for (int j = 0; j < arr.length; j++){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }



}
