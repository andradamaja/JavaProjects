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

    public int checkNumber(int x){

        if ((x >= 2 ) && (x <= 8)){
            return x;
        } else {
            return 0 ; // fara else {return 0} primesc eroarea missing return statement. De ce? Else nu e optional?
        }
    }

    public String checkTextAndNumber(String s, int x){

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

    public String checkInput(int x) {

        if ((x > 3) && (x != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
            return "The number is lower than 3";
        } else {
            return "?"; //aceeasi eroare missing return statement
        }
    }

    public String switchInputNumber(int x){

        switch (x){
            case 0: return "0"; break; //unreachable statement? de ce?
            case 1: return "1"; break;
            case 2: return "2"; break;
            case 3: return "3"; break;
            case 4: return "4"; break;
            case 5: return "5"; break;
            case 6: return "6"; break;
            case 7: return "7"; break;
            case 8: return "8"; break;
            case 9: return "9"; break;
            default:return "Not allowed";
        }
    }

    public boolean checkIfEven(int x){

        Calculator calc = new Calculator();

        if (calc.remainder(x, 2) == 0){
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



}
