Phase 1: The Core Gear

I created the abstract InventoryComponent class and the concrete Item class. The Item class stores a name and weight, and its methods display the item information and return its values. I tested my program with an iron sword and a health potion, and both displayed the correct weights.

InventoryComponent provides default implementations that throw UnsupportedOperationException for methods that do not apply to every component. This lets individual items and containers share the same interface without forcing every class to support operations that do not make sense for it. This supports transparency because the client can interact with different components through the same parent type, while unsupported operations are clearly identified.

----------------

Phase 2: The Nested Containers

In this phase, I created the Bag class, which extends InventoryComponent. The bag stores a name, a base weight, and a list of items or other inventory components. I implemented methods to add, remove, and retrieve components, as well as display the contents and calculate the total weight.

The Item class returns its own weight, while the Bag class calculates its weight by adding its base weight to the weights of all its contents. Polymorphism allows the bag to call getWeight() on every component without knowing its specific class. Recursion allows nested bags to calculate their own contents automatically, making the inventory easier to manage.

----------------

Phase 3: The Full Adventurer Inventory

In this phase, I built a complete adventurer inventory with a main backpack, individual items, a potion pouch, and a Bag of Holding containing a nested gem bag. I tested displaying the full inventory and calculating its total weight. I also displayed the potion pouch independently to show that the same methods work on a smaller part of the inventory.

I tested an unsupported operation by attempting to add a potion to a sword. The operation threw an UnsupportedOperationException, which I caught with a try-catch block. This showed that individual items cannot contain other items.

If a game designer wanted a new container type, such as a WeightlessBag, I could create a new class that extends InventoryComponent and implements the appropriate behavior. The existing Item and Bag classes would not need to change. This demonstrates the Open/Closed Principle because the system can be extended with new types without modifying existing classes.
