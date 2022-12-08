package transport;

public class Car extends Transport {
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmission;
    private String number;
    private final int seatCount;
    private double enginePower;

    public Car(String brand,
               String model,
               Integer year,
               String country,
               String color,
               String bodyType,
               boolean isSummerRubber,
               String transmission,
               String number,
               int seatCount,
               double enginePower,
               Integer maxSpeed,
               String refillType) {


    }
        super(brand, model, year, country, color, maxSpeed);

    this.bodyType =

    validateCarParameters(bodyType);
    this.isSummerRubber =isSummerRubber;
    this.transmission = validateTransmission(transmission);
    this.number = validateCarNumber(number);
    this.seatCount = validateSeatCount(seatCount);
    this.enginePower = validateEngine(enginePower);

    public String getBodyType() {
        return bodyType;
    }
    public boolean isSummerRubber() {
        return isSummerRubber;

}
    }



