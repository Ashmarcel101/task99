
package task16;

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.groom();
        gorilla.pet();
        boolean fed = gorilla.feed(true);
        System.out.println("Gorilla Eating: " + fed);
    }
}


interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}


class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        
        System.out.println("Gorilla is Clean.");
    }

    @Override
    public void pet() {
        
        System.out.println("You Tried to Tame the Gorilla. Be careful!");
    }
}