package dimaoleks.clossplatform_lab1.models;

public class Car {
    public String name;
    public int price;
    public String fuelType;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, int price, String fuelType)  {
        this(name, price);

        this.fuelType = fuelType;
    }
}
