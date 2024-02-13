public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    //Housecat constructor
    public HouseCat(String aName, double aWeight) {
        //Here, the 'super' keyword allows Housecat subclass to access the base class
        //constructor. This must be the first line of a subclass's constructor
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    //Override keyword allows housecat's 'noise' method to overide cat's method of the
    //same name
    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}