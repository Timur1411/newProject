import java.util.Objects;

public class car {
    String carname;
    String carcolor;
    String cartype;
    int carregnumber;

    car(String name, String color, String type, int number) {
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

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        else if (obj == null)
            return false;
        else if (getClass() != obj.getClass())
            return false;

        car other = (car) obj;
        if (!Objects.equals(carname, other.getCarname()))
            return false;
        else if (!Objects.equals(carcolor, other.getCarcolor()))
            return false;
        else if (!Objects.equals(cartype, other.getCartype()))
            return false;
        else if (carregnumber != other.getCarregnumber())
            return false;
        return true;
    }
}

