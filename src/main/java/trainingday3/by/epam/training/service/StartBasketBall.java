package trainingday3.by.epam.training.service;

import trainingday3.by.epam.training.entities.Ball;
import trainingday3.by.epam.training.entities.Basket;

import java.util.Scanner;

public class StartBasketBall {
    Scanner consol;
    Basket basket;

    public StartBasketBall() {
        basket = new Basket();
    }

    public void run() {
        System.out.println("Enter number 1.If you wont to add ball 2.See the number of blue balls in the basket 3.Basket weight 4. Delete last ball .Exit pres 5.");
        consol = new Scanner(System.in);

        int consoleNumber = checkNumber();
        switch (consoleNumber) {
            case 1:
                addBall();
                run();
                break;
            case 2:
                getBlueBalls();
                run();
                break;
            case 3:
                getBasketWeight();
                run();
                break;
            case 4:
                deleteBall();
                run();
                break;
            case 5:
                consol.close();
                break;
        }
    }

    private int checkNumber() {
        if (consol.hasNextInt()) {
            int enteredNumber = consol.nextInt();
            return enteredNumber;
        } else {
            System.out.println("You enter not a number.");
            run();
        }
        return -1;
    }

    private void addBall() {
        String color = chooseColorBall();
        int weight = chooseWeightBall();
        basket.addBall(new Ball(color, weight));
    }

    private String chooseColorBall() {
        System.out.println("What color of ball you want to add: 1.Add red 2.Add blue 3.Add yellow 4.Add black 5.Back .");

        int colorFromConsol = checkNumber();

        if (colorFromConsol > 0 && colorFromConsol <= 5) {
            switch (colorFromConsol) {
                case 1:
                    return "Red";
                case 2:
                    return "Blue";
                case 3:
                    return "Yellow";
                case 4:
                    return "Black";
                case 5:
                    run();
                    break;
            }
        } else {
            System.out.println("Only 1 to 4 can be entered!");
            chooseColorBall();
        }
        return "";
    }

    private int chooseWeightBall() {
        System.out.println("Enter weight of ball . For back press 0 ");

        int weight = checkNumber();
        if (weight == 0) {
            run();
        }
        if ((Integer.MAX_VALUE - weight) > basket.getWeight()) {
            return weight;
        } else {
            System.out.print("The mass entered is too large, the basket will be full.");
            chooseWeightBall();
        }
        return -1;
    }

    private void getBlueBalls() {
        System.out.println("In the basket " + basket.getBlueBalls() + " blue balls.");
    }

    private void getBasketWeight() {
        System.out.println("Weight of basket " + basket.getWeight() + " presumably kilograms but maybe pounds.");
    }

    private void deleteBall() {
        basket.deleteBall();
    }
}