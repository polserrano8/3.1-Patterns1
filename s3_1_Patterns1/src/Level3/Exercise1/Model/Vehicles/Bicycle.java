package Level3.Exercise1.Model.Vehicles;

public class Bicycle {
    private String name;

    public Bicycle(String bicycleName){
        this.name = bicycleName;
    }
    public void startUp(){
        System.out.println(name + ": Starting to pedal");
    }
    public void accelerate(){
        System.out.println(name + ": Pedaling faster!");
    }
    public void brake(){
        System.out.println(name + ": Braking with the handbrake. Not so fun");
    }

}
