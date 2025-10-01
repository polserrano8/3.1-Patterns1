package Level2.Exercise1.Model.Products;

public class GermanTelephone implements TelephoneNumber {
    private String germanNumber ="";
    @Override
    public TelephoneNumber numberCreation(String phoneNumber) {
        this.germanNumber = "+44"+ phoneNumber;
        return this;
    }
}
