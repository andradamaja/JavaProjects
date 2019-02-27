public class Print {

    public String printHelloName() {

        return "Hello \n Andrada";

    }

    public String printSum() {

        return "The addition of 7 and 8 is: " + (7 + 8);

    }

    public String printOps(){

        short a = -5 + 8 * 6;

        byte b = (55 + 9) % 9;

        float c = 20 + -3f * 5 / 8;

        short d = 5 + 15 / 3 * 2 - 8 % 3;

        return  "a. " + a + ";\n" + "b. " + b + ";\n" + "c. " + c + ";\n" + "d. " + d + ";";

    }


    public String printJava(){

        return  "   J   a  v     v  a\n" +
                "   J  a a  v   v  a a\n" +
                "J  J aaaaa  V V  aaaaa\n" +
                " JJ a     a  V  a     a\n";

    }


    public String printPattern(){

        return  "  +\"\"\"\"\"+\n" +

                "[ | o o | ]\n" +

                "  |  ^  |  \n" +

                "  | '_' |  \n" +

                "  +-----+\n";

    }
}
