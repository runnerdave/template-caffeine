package net.runnerdave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by davidajimenez on 27/06/2016.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("adding my teabag to the cup");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and lemon");
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
        System.out.print("Would you like lemon and sugar with your tea (y/n)? ");
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
