package Level2.Exercise1.Model.Products;

public class GermanAddress implements Address {
    String address = "";
    @Override
    public Address addressCreation(String recipientName, String streetName, String houseNumber, String postalCode, String city) {
        this.address =  " ["+ recipientName + "]\n"+
                " [ "+ streetName + "] "+" ["+ houseNumber+ "]\n"+
                " ["+ postalCode+ "] "+" ["+ city + "]\n"+
                " [Germany]";
        return this;
    }
}
