package io.zipcoder;

public class Pet implements Comparable<Pet>{
    public String name;
    public String type;

    public Pet() {
        name = "Java wrapper";
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String speak() {
        return "What's up doc?";
    }

    @Override
    public int compareTo(Pet o) {
        return this.getType().compareTo(o.getType());
    }
}
