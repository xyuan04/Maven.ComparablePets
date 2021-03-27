package io.zipcoder;

public class Mouse extends Pet {

    public Mouse(String name, String type) {
        super(name, type);
    }

    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super.name = "Mouse name";
        super.type = "mouse";
    }

    @Override
    public String speak() {
        return "Squeak!";
    }
}
