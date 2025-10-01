package Level2.Exercise1.Model.Factories;

import Level2.Exercise1.Model.Products.Address;
import Level2.Exercise1.Model.Products.TelephoneNumber;

public interface DirectoriesFactory {
    Address makeAddress(String recipientName, String streetName, String houseNumber, String postalCode, String city);
    TelephoneNumber makeTelephoneNumber(String telephoneNumber);


}
