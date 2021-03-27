package io.zipcoder;

public class Parrot extends Pet {

    public Parrot(String name, String type) {
        super(name, type);
    }

    public Parrot(String name) {
        super(name);
    }

    public Parrot() {
        super.name = "Parrot name";
        super.type = "parrot";
    }

    public String speak() {
        return "Give me a /br";
    }
}
