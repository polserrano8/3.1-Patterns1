package Level3.Exercise1.Model.Commands;

import Level3.Exercise1.Model.Vehicles.Bicycle;
import Level3.Exercise1.Model.Vehicles.Car;
import Level3.Exercise1.Model.Vehicles.Plane;
import Level3.Exercise1.Model.Vehicles.Ship;

public class AccelerateCommand implements Command{
    private Object vehicle;
    public AccelerateCommand(Object vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute(){
        if (vehicle instanceof Car) {
            ((Car) vehicle).accelerate();
        } else if (vehicle instanceof Bicycle) {
            ((Bicycle) vehicle).accelerate();
        } else if (vehicle instanceof Plane) {
            ((Plane) vehicle).accelerate();
        } else if (vehicle instanceof Ship) {
            ((Ship) vehicle).accelerate();
        }
    }
}
