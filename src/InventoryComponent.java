public abstract class InventoryComponent {

    public void add(InventoryComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(InventoryComponent component) {
        throw new UnsupportedOperationException();
    }

    public InventoryComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();

    public abstract double getWeight();

    public abstract void displayInfo();
}
