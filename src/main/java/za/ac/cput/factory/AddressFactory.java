package za.ac.cput.factory;

import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.util.Helper;

public class AddressFactory
{
    public static Address buildAddress(int addressId, String streetNum, String streetName, String residenceName,
                                       String city, String province, String postalCode){
        if (Helper.isZero(addressId) ||Helper.isInvalidStreetNum(streetNum) || Helper.isInvalidAddressComponent(streetName) ||
                Helper.isInvalidAddressComponent(residenceName) || Helper.isInvalidAddressComponent(city) ||
                Helper.isInvalidAddressComponent(province) || Helper.isInvalidPostalCode(postalCode))
            return null;

        return new Address.Builder().setAddressId(addressId)
                .setStreetNum(streetNum)
                .setStreetName(streetName)
                .setResidenceName(residenceName)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .build();
    }

}
