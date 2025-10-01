package Level3.Exercise1;

import Level3.Exercise1.Model.Commands.AccelerateCommand;
import Level3.Exercise1.Model.Commands.BrakeCommand;
import Level3.Exercise1.Model.Commands.StartUpCommand;
import Level3.Exercise1.Model.Controler;
import Level3.Exercise1.Model.Vehicles.Bicycle;
import Level3.Exercise1.Model.Vehicles.Car;
import Level3.Exercise1.Model.Vehicles.Plane;
import Level3.Exercise1.Model.Vehicles.Ship;

public class Main {
    public static void main(String[] args) {
        Car volvoX40 = new Car("VolvoX40");
        Bicycle capriValentina = new Bicycle(("Capri Valentina"));
        Plane airBus350 = new Plane("AirBus 350");
        Ship titanic1000 = new Ship("Titanic Pro");

        Controler vehicleControler = new Controler();
        System.out.println("Car Command Showcase: ");
        vehicleControler.executeCommand(new StartUpCommand(volvoX40));
        vehicleControler.executeCommand(new AccelerateCommand(volvoX40));
        vehicleControler.executeCommand(new BrakeCommand(volvoX40));
        System.out.println("\nBicycle Command Showcase: ");
        vehicleControler.executeCommand(new StartUpCommand(capriValentina));
        vehicleControler.executeCommand(new AccelerateCommand(capriValentina));
        vehicleControler.executeCommand(new BrakeCommand(capriValentina));
        System.out.println("\nPlane Command Showcase: ");
        vehicleControler.executeCommand(new StartUpCommand(airBus350));
        vehicleControler.executeCommand(new AccelerateCommand(airBus350));
        vehicleControler.executeCommand(new BrakeCommand(airBus350));
        System.out.println("\nShip Command Showcase: ");
        vehicleControler.executeCommand(new StartUpCommand(titanic1000));
        vehicleControler.executeCommand(new AccelerateCommand(titanic1000));
        vehicleControler.executeCommand(new BrakeCommand(titanic1000));


    }
}
