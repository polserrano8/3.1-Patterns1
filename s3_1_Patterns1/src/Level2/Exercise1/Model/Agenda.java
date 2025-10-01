package Level2.Exercise1.Model;

import Level2.Exercise1.Model.Products.Address;
import Level2.Exercise1.Model.Products.TelephoneNumber;

public class Agenda {
    private Address objectAddress;
    private TelephoneNumber objectPhoneNumber;

    public Agenda(){};

    public void addAddress(Address address){
        this.objectAddress = address;
    }
    public void addPhoneNumber(TelephoneNumber phoneNumber){
        this.objectPhoneNumber = phoneNumber;
    }
}
