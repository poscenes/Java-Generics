package VTB4.Exercise3;

public class MainApp {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox = new Box<>(new Apple());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());
        appleBox.addFruit(new Apple[2]);
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));

        Box<Fruit> box = new Box<>();
        box.shift(orangeBox);
        System.out.println(box.getWeight());
    }
}
