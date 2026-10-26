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

        // Create potion pouch
        Bag potionPouch = new Bag("Potion Pouch", 0.3);
        potionPouch.add(healthPotion);
        potionPouch.add(manaPotion);

        // Create nested gem bag
        Bag gemBag = new Bag("Gem Bag", 0.2);
        gemBag.add(ruby);
        gemBag.add(goldCoin);

        Bag holdingBag = new Bag("Bag of Holding", 0.5);
        holdingBag.add(gemBag);

        // Create main backpack
        Bag backpack = new Bag("Main Backpack", 2.0);
        backpack.add(bedroll);
        backpack.add(rope);
        backpack.add(sword);
        backpack.add(potionPouch);
        backpack.add(holdingBag);

        // Display full inventory
        System.out.println("=== Complete Inventory ===");
        backpack.displayInfo();
        System.out.println("Total Backpack Weight: "
                + backpack.getWeight() + " lbs");

        // Test displaying an inner pouch
        System.out.println("\n=== Potion Pouch ===");
        potionPouch.displayInfo();
        System.out.println("Potion Pouch Weight: "
                + potionPouch.getWeight() + " lbs");

        // Test 1: Empty bag
        System.out.println("\n=== Test 1: Empty Bag ===");
        Bag emptyBag = new Bag("Empty Bag", 1.0);
        emptyBag.displayInfo();
        System.out.println("Empty bag weight: "
                + emptyBag.getWeight() + " lbs");

        // Test 2: Removing an item
        System.out.println("\n=== Test 2: Remove an Item ===");
        Bag testBag = new Bag("Test Bag", 1.0);
        Item testSword = new Item("Test Sword", 3.0);
        Item testPotion = new Item("Test Potion", 0.5);

        testBag.add(testSword);
        testBag.add(testPotion);

        System.out.println("Weight before removal: "
                + testBag.getWeight() + " lbs");

        testBag.remove(testSword);

        System.out.println("Weight after removal: "
                + testBag.getWeight() + " lbs");

        // Test 3: Nested weight calculation
        System.out.println("\n=== Test 3: Nested Weight ===");
        System.out.println("Gem Bag weight: "
                + gemBag.getWeight() + " lbs");
        System.out.println("Bag of Holding weight: "
                + holdingBag.getWeight() + " lbs");

        // Test 4: Unsupported operation on an item
        System.out.println("\n=== Test 4: Unsupported Operation ===");
        try {
            sword.add(healthPotion);
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warning: An individual item cannot contain other items."
            );
        }
    }
}
