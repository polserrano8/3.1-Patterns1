package Level2.Exercise1.Model.Products;

public interface Address {
    Address addressCreation(String recipientName, String streetName, String houseNumber, String postalCode, String city);
}
