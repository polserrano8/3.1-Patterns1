package Level2.Exercise1.Model.Factories;

import Level2.Exercise1.Model.Products.Address;
import Level2.Exercise1.Model.Products.FrenchAddress;
import Level2.Exercise1.Model.Products.FrenchTelephone;
import Level2.Exercise1.Model.Products.TelephoneNumber;

public class FrenchDirectoryFactory implements DirectoriesFactory {
    @Override
    public Address makeAddress(String recipientName, String streetName, String houseNumber, String postalCode, String city) {
        return  new FrenchAddress().addressCreation(recipientName,streetName,houseNumber,postalCode,city);
    }
    public TelephoneNumber makeTelephoneNumber(String frenchNumber) {
        return new FrenchTelephone().numberCreation(frenchNumber);
    }
}
