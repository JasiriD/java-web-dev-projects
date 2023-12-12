package org.launchcode;
import java.util.Scanner;

import static org.launchcode.Circle.getArea;

public class Area {
    public static void main(String[] args) {

        //Setting up scanner object in order to collect input
        Scanner input;
        input = new Scanner(System.in);


        System.out.println("Enter a radius:");

        double radius;
        radius = input.nextDouble();

        double area = getArea(radius);

        System.out.println("The area of a circle with the radius " + radius + " is " + area);
    }
}
