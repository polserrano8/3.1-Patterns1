package Level3.Exercise1.Model.Commands;

import Level3.Exercise1.Model.Vehicles.Bicycle;
import Level3.Exercise1.Model.Vehicles.Car;
import Level3.Exercise1.Model.Vehicles.Plane;
import Level3.Exercise1.Model.Vehicles.Ship;

public class StartUpCommand implements Command{
    private Object vehicle;
    public StartUpCommand(Object vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute(){
        if (vehicle instanceof Car) {
            ((Car) vehicle).startUp();
        } else if (vehicle instanceof Bicycle) {
            ((Bicycle) vehicle).startUp();
        } else if (vehicle instanceof Plane) {
            ((Plane) vehicle).startUp();
        } else if (vehicle instanceof Ship) {
            ((Ship) vehicle).startUp();
        }
    }
}
