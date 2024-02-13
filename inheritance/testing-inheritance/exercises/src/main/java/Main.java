public class Main {
    public static void main(String[] args) {
        //Creating a new Housecat named Garfield weighing 12 lbs
        HouseCat garfield = new HouseCat("Garfield", 12);
        //Making Garfield eat
        garfield.eat();
        //Making garfield say something
        //Note that garfield uses the noise method in the HouseCat class as opposed
        //to the noise method in the Cat class
        System.out.println(garfield.noise());
        //Prints true due to garfield.eat setting Garfield's tired status to true
        System.out.println(garfield.isTired());
    }
}
