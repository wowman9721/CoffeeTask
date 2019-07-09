package com.epam.lab27.coffeeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeService {
    Scanner scanner = new Scanner(System.in);

    public void makeAmericano() {
        List<Coffee> americano = new ArrayList<>();
        System.out.println("Please enter water quantity, sugar quantity, milk quantity! ");
        americano.add(new Americano(scanner.nextDouble(), "Brazilian", scanner.nextDouble(), scanner.nextDouble(), 350.0));
        System.out.println(americano);
        System.out.println("Done!");
    }

    public void makeEspresso() {
        List<Coffee> espresso = new ArrayList<>();
        System.out.println("Please enter water quantity, sugar quantity, milk quantity! ");
        espresso.add(new Espresso(scanner.nextDouble(), "Columbian", scanner.nextDouble(), scanner.nextDouble(), 450.0));
        System.out.println(espresso);
        System.out.println("Done!");
    }

    public void makeCappucino() {
        List<Coffee> capuccino = new ArrayList<>();
        System.out.println("Please enter water quantity, sugar quantity, milk quantity! ");
        capuccino.add(new Cappucino(scanner.nextDouble(), "Arabica", scanner.nextDouble(), scanner.nextDouble(), 550.0));
        System.out.println(capuccino);
        System.out.println("Done!");

    }

    public void selectCoffee() {
        System.out.println("1 - Americano");
        System.out.println("2 - Espresso");
        System.out.println("3 - Capuccino");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case (1):
                System.out.println("You selected Americano");
                makeAmericano();
                break;
            case (2):
                System.out.println("You selected Espresso");
                makeEspresso();
                break;
            case (3):
                System.out.println("You selected Capuccino");
                makeCappucino();
                break;
            default:
                System.out.println("Enter number of coffee!");
                break;
        }

    }
}
