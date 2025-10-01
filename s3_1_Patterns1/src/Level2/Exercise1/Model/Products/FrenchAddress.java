package Level2.Exercise1.Model.Products;

public class FrenchAddress implements Address {
    @Override
    public Address addressCreation(String recipientName, String streetName, String houseNumber, String postalCode, String city) {
        String frenchAddress = " [" + recipientName + "]\n" +
                " [ " + houseNumber + "] " + " [" + streetName + "]\n" +
                " [" + postalCode + "] " + " [" + city + "]\n" +
                " [France]";
        return this;
    }
}
