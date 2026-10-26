
public class Main {

    public static void main(String[] args) {

        // Create individual items
        Item bedroll = new Item("Bedroll", 4.0);
        Item rope = new Item("Rope", 3.0);
        Item sword = new Item("Iron Sword", 3.5);
        Item healthPotion = new Item("Health Potion", 0.5);
        Item manaPotion = new Item("Mana Potion", 0.5);
        Item ruby = new Item("Ruby", 0.2);
        Item goldCoin = new Item("Gold Coin", 0.1);

        // Create a potion pouch
        Bag potionPouch = new Bag("Potion Pouch", 0.3);
        potionPouch.add(healthPotion);
        potionPouch.add(manaPotion);

        // Create a gem bag nested inside another bag
        Bag gemBag = new Bag("Gem Bag", 0.2);
        gemBag.add(ruby);
        gemBag.add(goldCoin);

        Bag holdingBag = new Bag("Bag of Holding", 0.5);
        holdingBag.add(gemBag);

        // Create the main backpack
        Bag backpack = new Bag("Main Backpack", 2.0);
        backpack.add(bedroll);
        backpack.add(rope);
        backpack.add(sword);
        backpack.add(potionPouch);
        backpack.add(holdingBag);

        // Display the entire inventory
        System.out.println("=== Complete Adventurer Inventory ===");
        backpack.displayInfo();

        // Calculate the total weight
        System.out.println();
        System.out.println("Total Backpack Weight: "
                + backpack.getWeight() + " lbs");

        // Display an inner pouch independently
        System.out.println();
        System.out.println("=== Potion Pouch Only ===");
        potionPouch.displayInfo();

        System.out.println("Potion Pouch Total Weight: "
                + potionPouch.getWeight() + " lbs");

        // Demonstrate unsupported operations on an Item
        System.out.println();
        System.out.println("=== Testing Unsupported Operation ===");

        try {
            sword.add(healthPotion);
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warning: An individual item cannot contain other items."
            );
        }
    }
}
