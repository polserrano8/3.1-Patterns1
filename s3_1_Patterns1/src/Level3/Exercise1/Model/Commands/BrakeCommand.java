package Level3.Exercise1.Model.Commands;

import Level3.Exercise1.Model.Vehicles.Bicycle;
import Level3.Exercise1.Model.Vehicles.Car;
import Level3.Exercise1.Model.Vehicles.Plane;
import Level3.Exercise1.Model.Vehicles.Ship;

public class BrakeCommand implements Command{
    private Object vehicle;
    public BrakeCommand(Object vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute(){
        if (vehicle instanceof Car) {
            ((Car) vehicle).brake();
        } else if (vehicle instanceof Bicycle) {
            ((Bicycle) vehicle).brake();
        } else if (vehicle instanceof Plane) {
            ((Plane) vehicle).brake();
        } else if (vehicle instanceof Ship) {
            ((Ship) vehicle).brake();
        }
    }
}
