package com.company;

import java.util.Scanner;
import java.util.logging.Logger;

public class Input {

    Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    /**
     * lets you enter strings until you enter a valid credit card number (16 digits)
     *
     * @return the valid credit card number
     */
    String enterNumber() {
        System.out.println("please enter your credit card number:");
        boolean isValid = true;
        String input = null;
        Scanner scanner = new Scanner(System.in);
        while (isValid) {
            input = scanner.next();
            isValid = !(checkForInteger(input) && input.length() == 16);
            if(input.length() != 16){
                log.info("the entered number is ether to short or to long to be a valid credit card number");
            }
        }
        return input;
    }

    private boolean checkForInteger(String input) {
        try {
//            Ich bin mir nicht sicher wie du es gemacht hast aber es kann sein, dass hier das Problem war.
//            Da eine 16 stellige Zahl größer als ein int ist kann man den String nicht auf einen int parsen.
            Double.parseDouble(input);
        } catch (Exception e) {
            log.info("please enter a valid credit card number with digits only");
            return false;
        }
        return true;
    }
}
