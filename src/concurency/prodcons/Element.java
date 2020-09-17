package concurency.prodcons;

import java.util.Random;

public class Element {
    private final int number;
    private final int value;

    public Element(int number) {
        this.number = number;
        this.value = new Random().nextInt(100);
    }

    public Element(int number, int value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "number: " + number + ", value: " + value;
    }
}
