package net.runnerdave;

/**
 * Created by davidajimenez on 27/06/2016.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("##### Here comes the beverages:");

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("### Making tea:");
        tea.prepareRecipe();

        System.out.println("### Making coffee:");
        coffee.prepareRecipe();
    }
}
