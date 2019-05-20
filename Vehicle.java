public abstract class Vehicle {

    private String name;
    private int kilometers;

    public Vehicle(String name, int kilometers) {
        this.name = name;
        this.kilometers = kilometers;
    }

    public String getName() {
        return this.name;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}