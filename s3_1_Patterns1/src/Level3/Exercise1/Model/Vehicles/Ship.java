package Level3.Exercise1.Model.Vehicles;

public class Ship {
    private String name;

    public Ship(String shipName){
        this.name = shipName;
    }
    public void startUp(){
        System.out.println(name + ": Motor booted up and Helix's working.");
    }
    public void accelerate(){
        System.out.println(name + ": Navigating to full power!");
    }
    public void brake(){
        System.out.println(name + ": Reverting motors to stop as soon as possible!");
    }

}
