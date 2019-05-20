public class Car extends Vehicle {

    public Car(String name, int kilometers) {
        super(name, kilometers);
    }

    @Override
    public String doStuff(){
        return "vroum vroum";
    }
}