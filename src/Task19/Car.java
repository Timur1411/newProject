package Task19;

import java.util.Objects;

public class Car {
    private String carname;
    private String carcolor;
    private String cartype;
    private int carregnumber;

    Car(String name, String color, String type, int number) {
        this.carname = name;
        this.carcolor = color;
        this.cartype = type;
        this.carregnumber = number;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public int getCarregnumber() {
        return carregnumber;
    }

    public void setCarregnumber(int carregnumber) {
        this.carregnumber = carregnumber;
    }

    public String getFields(){
        String print="\tМарка: "+carname+"\n\tЦвет: "+carcolor+"\n\tТип кузова: "+cartype+"\n\tРег.номер: "+carregnumber;
        return print;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        else if (obj == null) {
            return false;
        }
        else if (getClass() != obj.getClass()) {
            return false;
        }

        Car other = (Car) obj;
        if (Objects.equals(carname, other.getCarname())&&Objects.equals(carcolor, other.getCarcolor())&&Objects.equals(cartype, other.getCartype())&&carregnumber==other.getCarregnumber()) {
            return true;
        }
        else {
            return false;
        }
    }
}

