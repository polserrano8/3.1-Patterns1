package Level2.Exercise1.Model.Factories;

import Level2.Exercise1.Model.Products.Address;
import Level2.Exercise1.Model.Products.GermanAddress;
import Level2.Exercise1.Model.Products.GermanTelephone;
import Level2.Exercise1.Model.Products.TelephoneNumber;

public class GermanDirectoryFactory implements DirectoriesFactory {

    @Override
    public Address makeAddress(String recipientName, String streetName, String houseNumber, String postalCode, String city) {
        return new GermanAddress().addressCreation(recipientName,streetName,houseNumber,postalCode,city);
    }

    @Override
    public TelephoneNumber makeTelephoneNumber(String telephoneNumber) {
        return new GermanTelephone().numberCreation(telephoneNumber);
    }
}
