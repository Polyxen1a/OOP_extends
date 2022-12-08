package transport;

import static transport.ValidateUtils.validateString;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private Integer maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int year, String country, String color, Integer maxSpeed) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.maxSpeed = maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getFuel() {
        return getFuel();
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public static int validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String validateColor(String value) {
        return validateString(value, "белый");
    }

    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }

    public String validateCountry(String value) {
        return validateString(value, "Rus");
    }

    abstract void refill(String fuel);

    @Override
    public String toString() {
        return "Transport{" +
                ", brand= " + brand +
                ", model= " + model +
                ", year= " + year +
                ", country= " + country +
                ", color= " + color +
                ", maxSpeed= " + maxSpeed;
    }
}
