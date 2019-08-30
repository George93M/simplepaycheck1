package PaycheckCalc;

public abstract class Entity {

    private String city;

    public String getCity() {
        return city;
    }

    public Entity(String city) {

        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else
        throw new InvalidDataException("City not shown");
    }

    public Entity() {
    }

    @Override
    public String toString() {
        return "The city is " + city +
                " and the amount: " + amountReceived() + "\n";
    }

    public abstract double amountReceived();

}
