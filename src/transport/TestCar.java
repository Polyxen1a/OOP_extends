package transport;

public class TestCar {
    public static void main(String[] args) {

        Car audi = new Car("audi",
                "Q8",
                1000,
                "***",
                "yellow",
                "hatchback",
                 false,
                null,
                "у345зф174",
                4,
                20,
                200,
                "petrol");

        System.out.println(audi);
        audi.refill("petrol");

        Train train = new Train("Ласточка",
                "В-901",
                2011,
                "Rus",
                "grey",
                60,
                "Белорусский вокзал",
                "Минск",
                11,
                301);
        System.out.println(train);
        train.refill("diesel");
    }
}
