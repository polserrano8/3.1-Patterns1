package Level3.Exercise1.Model.Vehicles;

public class Plane {
    private String name;

    public Plane(String planeName){
        this.name = planeName;
    }
    public void startUp(){
        System.out.println(name + ": Turbines started. Full power to fly!");
    }
    public void accelerate(){
        System.out.println(name + ": Accelerating to the stars !");
    }
    public void brake(){
        System.out.println(name + ": Braking with flaps, taking out the landing gear!");
    }


}
