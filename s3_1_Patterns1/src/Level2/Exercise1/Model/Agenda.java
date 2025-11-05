package Level2.Exercise1.Model;

import Level2.Exercise1.Model.Products.Address;
import Level2.Exercise1.Model.Products.TelephoneNumber;

public class Agenda {

    private Address AddressObj;
    private TelephoneNumber PhoneNumberObj;

    public void addAddress(Address address){
        this.AddressObj = address;
    }
    public void addPhoneNumber(TelephoneNumber phoneNumber){
        this.PhoneNumberObj = phoneNumber;
    }
}
