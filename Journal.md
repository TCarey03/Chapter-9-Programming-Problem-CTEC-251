Phase 1: The Core Gear

I created the abstract InventoryComponent class and the concrete Item class. The Item class stores a name and weight, and its methods display the item information and return its values. I tested my program with an iron sword and a health potion, and both displayed the correct weights.

InventoryComponent provides default implementations that throw UnsupportedOperationException for methods that do not apply to every component. This lets individual items and containers share the same interface without forcing every class to support operations that do not make sense for it. This supports transparency because the client can interact with different components through the same parent type, while unsupported operations are clearly identified.

----------------

Phase 2: The Nested Containers

In this phase, I created the Bag class, which extends InventoryComponent. The bag stores a name, a base weight, and a list of items or other inventory components. I implemented methods to add, remove, and retrieve components, as well as display the contents and calculate the total weight.

The Item class returns its own weight, while the Bag class calculates its weight by adding its base weight to the weights of all its contents. Polymorphism allows the bag to call getWeight() on every component without knowing its specific class. Recursion allows nested bags to calculate their own contents automatically, making the inventory easier to manage.
