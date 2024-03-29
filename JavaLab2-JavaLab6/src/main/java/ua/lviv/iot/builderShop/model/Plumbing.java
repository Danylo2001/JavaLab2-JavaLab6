package ua.lviv.iot.builderShop.model;

public class Plumbing extends BuilderGoods {


    public Plumbing() {
    }

    public Plumbing(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
                    String producer, int width, double volume) {
        super(name, weight, material, height, typeOfGoods, price, producer, width);
        this.volume = volume;
    }
    private double volume;
    public String getHeaders() {
        return super.getHeaders() + ","
                + "volume";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.volume;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "volume = " + volume;
    }


}
