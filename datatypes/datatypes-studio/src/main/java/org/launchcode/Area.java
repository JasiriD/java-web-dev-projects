package org.launchcode;
import java.util.Scanner;

import static org.launchcode.Circle.getArea;
import static org.launchcode.Circle.swagNigga;

public class Area {
    public static void main(String[] args) {

        //Setting up scanner object in order to collect input
        Scanner input;
        input = new Scanner(System.in);


        System.out.println("Enter a radius:");

        //Initializing radius variable
        double radius;

        //Setting radius to the input collected by the user
        radius = input.nextDouble();



        //Calling getArea from the Circle class within Circle.java

        //Conditional to check that radius is greater than 0
        if(radius > 0){
            double area = getArea(radius);

            //Final output
            System.out.println("The area of a circle with the radius " + radius + " is " + area);
        }
        else{
            System.out.println("Your radius cannot be negative.");
        }

    }
}
