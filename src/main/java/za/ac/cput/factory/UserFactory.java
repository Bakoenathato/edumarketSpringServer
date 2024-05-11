package za.ac.cput.factory;

import jakarta.persistence.OneToOne;
import za.ac.cput.domain.User;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;
import za.ac.cput.util.Helper;

public class UserFactory
{
    public static User buildUser(int userId, String userFName, String userLName, String userRole, Address address, Contact contact, String userPassword){
        if (Helper.isZero(userId) || Helper.isInvalidName(userFName) || Helper.isInvalidName(userLName) || Helper.isNullOrEmpty(userRole) ||
                address == null || contact == null || !Helper.isValidPassword(userPassword))
            return null;
        return new User.Builder().setUserId(userId)
                .setUserFName(userFName)
                .setUserLName(userLName)
                .setUserAddress(address)
                .setUserContact(contact)
                .setUserRole(userRole)
                .setUserPassword(userPassword)
                .build();
    }

    public static User buildUser(int userId, String userFName, String userLName, String userRole, String userPassword,
                                 int addressId, String streetNum, String streetName, String residenceName, String city, String province, String postalCode,
                                 String studentEmail, String cellNumber){
        if(Helper.isZero(userId) || Helper.isInvalidName(userFName) || Helper.isInvalidName(userLName) || Helper.isNullOrEmpty(userRole) || !Helper.isValidPassword(userPassword))
            return null;

        if (Helper.isZero(addressId) || Helper.isInvalidStreetNum(streetNum) || Helper.isInvalidAddressComponent(streetName ) || Helper.isInvalidAddressComponent(residenceName) ||
            Helper.isInvalidAddressComponent(city) || Helper.isInvalidAddressComponent(province) || Helper.isInvalidPostalCode(postalCode))
            return null;

        if (!Helper.isValidEmail(studentEmail) || Helper.isInvalidPhoneNumber(cellNumber))
            return null;


        Address address = AddressFactory.buildAddress(addressId, streetNum, streetName, residenceName, city, province, postalCode);
        Contact contact = ContactFactory.buildContact(studentEmail, cellNumber);

        return new User.Builder()
                .setUserFName(userFName)
                .setUserLName(userLName)
                .setUserRole(userRole)
                .setUserAddress(address)
                .setUserContact(contact)
                .setUserPassword(userPassword)
                .build();
    }


}
