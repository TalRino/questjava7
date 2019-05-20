public class Hangar {

    public static void main(String[] args) {

        Car golf = new Car("Golf", 1000);

        System.out.println("I am a " + golf.getName() + " and i do " + golf.doStuff() + " !");
        System.out.println("My " + golf.getName() + " are " + golf.getKilometers() + " kilometers to the counters.");

        Boat privatejet = new Boat("Private Jet", 2000);

        System.out.println("I am a " + privatejet.getName() + " and i do " + privatejet.doStuff() + " !");
        System.out.println("My " + privatejet.getName() + " are " + privatejet.getKilometers() + " kilometers to the counters.");
    
    }
}