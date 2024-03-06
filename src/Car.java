public class Car {
    protected String make;
    protected static String fuelType;
    protected int year;

    Car(){

        fuelType = "Gas";
    }

    public void setMake(){

        this.setMake();
    }
    public String getMake(){

        return getMake();
    }
    Car(String make, int year){
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString(){
        return ("Your car is a " + this.make + ", made in the year " + this.year + ".");
    }

}

