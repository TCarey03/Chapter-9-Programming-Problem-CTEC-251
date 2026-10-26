public class Main {

    public static void main(String[] args) {

        Item sword = new Item("Iron Sword", 3.5);
        Item potion = new Item("Health Potion", 0.5);

        Bag pouch = new Bag("Belt Pouch", 0.5);

        pouch.add(sword);
        pouch.add(potion);

        System.out.println("=== Bag Contents ===");
        pouch.displayInfo();

        System.out.println();

        System.out.println("Total bag weight: "
                + pouch.getWeight() + " lbs");
    }
}
