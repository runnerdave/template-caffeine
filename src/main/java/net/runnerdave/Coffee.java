package net.runnerdave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by davidajimenez on 27/06/2016.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
