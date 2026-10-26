Phase 1: The Core Gear

I created the abstract InventoryComponent class and the concrete Item class. The Item class stores a name and weight, and its methods display the item information and return its values. I tested my program with an iron sword and a health potion, and both displayed the correct weights.

InventoryComponent provides default implementations that throw UnsupportedOperationException for methods that do not apply to every component. This lets individual items and containers share the same interface without forcing every class to support operations that do not make sense for it. This supports transparency because the client can interact with different components through the same parent type, while unsupported operations are clearly identified.
