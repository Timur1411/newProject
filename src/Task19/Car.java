package Task19;

import java.util.Objects;

public class Car {
    private String name;
    private String color;
    private String type;
    private int number;

    Car(String name, String color, String type, int number) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\tМарка: " + name + "\n\tЦвет: " + color + "\n\tТип кузова: " + type + "\n\tРег.номер: " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }

        Car other = (Car) obj;
        if (Objects.equals(name, other.getName()) && Objects.equals(color, other.getColor()) && Objects.equals(type, other.getType()) && number == other.getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}

