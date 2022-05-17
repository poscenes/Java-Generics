package VTB4.Exercise3;

public class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getFruitWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5);
    }
}