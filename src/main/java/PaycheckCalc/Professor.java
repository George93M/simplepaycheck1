package PaycheckCalc;

public class Professor extends Entity {

    private double salary;

    public Professor(String city, double salary) {
        super(city);


        if(salary > 0) {
            this.salary = salary;
        } else throw new InvalidDataException("Salary not good");
    }


    @Override
    public double amountReceived() {
        return salary;
    }
}
