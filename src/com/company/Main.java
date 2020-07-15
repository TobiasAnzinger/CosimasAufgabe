package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Input input = new Input();

//        TODO du kannst die Zeilen hier vertauschen wenn du die Nummer nicht selbst eingeben willst
        String cardNumber = input.enterNumber();
//        String cardNumber = "2718281828458567";

        Converter converter = new Converter();
        ArrayList<Integer> cardNumberList = new ArrayList<>(converter.convertToArrayList(cardNumber));

        System.out.println("The entered card number:\n");
        System.out.println(cardNumberList + "\n");

        Iterations iterations = new Iterations();

        cardNumberList = iterations.iteration1(cardNumberList);
        System.out.println("Iteration 1\n" +cardNumberList + "\n");

        cardNumberList = iterations.iteration2(cardNumberList);
        System.out.println("Iteration 2\n" + cardNumberList + "\n");

        cardNumberList = iterations.iteration3(cardNumberList);
        System.out.println("Iteration 3\n" + cardNumberList + "\n");

        iterations.iteration4();
        System.out.println("Iteration 4\n" +cardNumberList + "\n");

        iterations.iteration5();
        System.out.println("Iteration 5\n" + cardNumberList + "\n");

        iterations.iteration6();
        System.out.println("Iteration 6\n" + cardNumberList + "\n");

        if (iterations.verification(cardNumberList)) {
            System.out.println("The credit card is valid!");
        } else {
            System.out.println("The credit card is not valid!");
        }
    }

}
