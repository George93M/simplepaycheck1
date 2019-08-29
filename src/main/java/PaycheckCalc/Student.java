package PaycheckCalc;

public class Student extends Entity {

    private double scholarship;

    public Student(String city, double scholarship) {
        super(city);


        if(scholarship > 0) {
            this.scholarship = scholarship;
        } else throw new InvalidDataException("Scholarship not good");
    }



    @Override
    public double amountReceived() {
        return scholarship;
    }
}


//extindeme runtimeexception
