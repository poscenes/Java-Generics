package VTB4.Exercise3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> storage;

    public Box() {
        this.storage = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.storage = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        this.storage.add(fruit);
    }

    public void addFruit(T... fruits) {
        this.storage.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        if (storage.size() == 0)
            return 0;
        return storage.size() * storage.get(0).getFruitWeight();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.000001;
    }

    public void shift(Box<? extends T> box) {
        if (this == box) {
            System.out.println("Вы перебираете фрукты внутри одной коробки.");
            return;
        }
        this.storage.addAll(box.storage);
        box.storage.clear();
    }
}
