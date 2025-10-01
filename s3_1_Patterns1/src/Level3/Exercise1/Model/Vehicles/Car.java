package Level3.Exercise1.Model.Vehicles;

public class Car {

    private String name;

    public Car(String carName){
        this.name = carName;
    }
    public void startUp(){
        System.out.println(name + ": Motor booted up. Brum Brum!");
    }
    public void accelerate(){
        System.out.println(name + ": Accelerating to the horizon !");
    }
    public void brake(){
        System.out.println(name + ": Braking with all we got. Screeech!");
    }


}
