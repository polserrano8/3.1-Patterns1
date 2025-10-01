package Level2.Exercise1.Model.Products;

public class FrenchTelephone implements TelephoneNumber{
    @Override
    public TelephoneNumber numberCreation(String phoneNumber) {
        String phone =  "+33"+ phoneNumber;
        return this;
    }
}
