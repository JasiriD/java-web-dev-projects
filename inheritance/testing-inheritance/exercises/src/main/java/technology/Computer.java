package technology;

public class Computer {
    //Is computer on?
    private boolean poweredOn = false;

    //Is computer's OS Windows?
    private boolean windows = false;

    //Age of computer in years
    private int ageInYears;

    //Constructor for Computer class
    public Computer(int iageInYears){
        ageInYears = iageInYears;
    }


    /*Getters and setters */


    //poweredOn
    public boolean isPoweredOn(){
        return poweredOn;
    }
    public void setPoweredOn(boolean apoweredOn){
        poweredOn = apoweredOn;
    }

    //windows
    public boolean isWindows(){
        return windows;
    }
    public void setWindows(boolean awindows){
        windows = awindows;
    }

    //ageInYears
    public int getAgeInYears(){
        return ageInYears;
    }
    public void setAgeInYears(int iageInYears){
        ageInYears = iageInYears;
    }


    /*Methods*/

    //Computer boots and returns different messages if Windows or Other
    public String boot(boolean windows){
        setPoweredOn(true);
        if(windows = true){
            return ("Welcome to windows os!");
        }
        else{
            return ("Welcome to not windows os!");
        }
    }

    //Computer does basic addition with 2 numbers
    public int addTwoNumbers(int numOne, int numTwo){
        return (numTwo + numOne);
    }




}
