
package task13;
class Dish {
    String name;
    String[] ingredients;

    public Dish(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public void showIngredients() {
        System.out.println("Ingredients for " + name + ":");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println();
    }
}


class Afritada extends Dish {
    public Afritada() {
        super("Afritada", new String[]{
            "Tomato Sauce", "Meat", "Potatoes & Carrots", "Spread"
        });
    }
}


class Mechado extends Dish {
    public Mechado() {
        super("Mechado", new String[]{
            "Tomato Sauce", "Meat", "Tomato Paste", "Liver Spread"
        });
    }
}


class Menudo extends Dish {
    public Menudo() {
        super("Menudo", new String[]{
            "Tomato Sauce", "Meat", "Potatoes & Carrots", "Raisins", "Hotdog"
        });
    }
}


class Caldereta extends Dish {
    public Caldereta() {
        super("Caldereta", new String[]{
            "Tomato Sauce", "Meat", "Liver Spread", "Cheese"
        });
    }
}


public class Task13 {
    public static void main(String[] args) {
        Dish meal1 = new Afritada();
        Dish meal2 = new Mechado();
        Dish meal3 = new Menudo();
        Dish meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}