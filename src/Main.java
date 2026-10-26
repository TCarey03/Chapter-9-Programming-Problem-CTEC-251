public class Main {

    public static void main(String[] args) {

        Item sword = new Item("Iron Sword", 3.5);
        Item potion = new Item("Health Potion", 0.5);

        sword.displayInfo();
        potion.displayInfo();

        System.out.println("Sword weight: " + sword.getWeight() + " lbs");
        System.out.println("Potion weight: " + potion.getWeight() + " lbs");
    }
}
