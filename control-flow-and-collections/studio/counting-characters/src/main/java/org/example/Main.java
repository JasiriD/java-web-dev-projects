package org.example;


import java.util.HashMap;

import static org.example.letterChecker.returnResults;

public class Main {
    public static void main(String[] args) {
        //Initial test string (5 Is, 3 as, 7 Bs, 5 cs)
        String test = "IIIIIaaaBBBBBBBccccc";

        System.out.println(returnResults(test) + "\n");

        //Second test is an exerpt from Taiwan's wikipedia page
        test = "The main island of Taiwan, also known as Formosa, has an area of 35,808 square kilometres (13,826 square miles), with mountain ranges dominating the eastern two-thirds and plains in the western third, where its highly urbanized population is concentrated. The capital, Taipei, forms along with New Taipei City and Keelung the largest metropolitan area. With around 23.9 million inhabitants, Taiwan is among the most densely populated countries.";

        System.out.println(returnResults(test) + "\n");

    }
}