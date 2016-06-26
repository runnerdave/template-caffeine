package net.runnerdave;

/**
 * Created by davidajimenez on 27/06/2016.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring in cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
