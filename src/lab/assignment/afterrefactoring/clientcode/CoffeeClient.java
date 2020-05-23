package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrerefactoring.AmericanoMaker;
import lab.assignment.afterrerefactoring.CapuccinoMaker;
import lab.assignment.afterrerefactoring.CoffeeMaker;
import lab.assignment.afterrerefactoring.MochaMaker;

public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.prepareCoffee();
    }
}