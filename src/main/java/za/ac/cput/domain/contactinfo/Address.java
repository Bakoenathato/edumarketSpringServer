package za.ac.cput.domain.contactinfo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Address
{
    @Id
    private int addressId;
    private String streetNum;
    private String streetName;
    private String residenceName;
    private String city;
    private String province;
    private String postalCode;

    protected Address() {
    }

    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNum = builder.streetNum;
        this.streetName = builder.streetName;
        this.residenceName = builder.residenceName;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return addressId == address.addressId && Objects.equals(streetNum, address.streetNum) && Objects.equals(streetName, address.streetName) && Objects.equals(residenceName, address.residenceName) && Objects.equals(city, address.city) && Objects.equals(province, address.province) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, streetNum, streetName, residenceName, city, province, postalCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetNum='" + streetNum + '\'' +
                ", streetName='" + streetName + '\'' +
                ", residenceName='" + residenceName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder{
        private int addressId;
        private String streetNum;
        private String streetName;
        private String residenceName;
        private String city;
        private String province;
        private String postalCode;

        public Builder setAddressId(int addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNum(String streetNum) {
            this.streetNum = streetNum;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setResidenceName(String residenceName) {
            this.residenceName = residenceName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address userAdd){
            this.addressId = userAdd.addressId;
            this.streetNum = userAdd.streetNum;
            this.streetName = userAdd.streetName;
            this.residenceName = userAdd.residenceName;
            this.city = userAdd.city;
            this.province = userAdd.province;
            this.postalCode = userAdd.postalCode;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
