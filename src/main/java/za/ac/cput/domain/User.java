package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;

@Entity
public class User
{
    @Id
    private int userId;
    private String userFName;
    private String userLName;
    private String userRole;
    private String userPassword;

    @OneToOne
    private Contact userContact;

    @OneToOne
    private Address userAddress;

    @CreatedDate
    private LocalDateTime dateCreated;

    @LastModifiedDate
    private LocalDateTime dateUpdated;

    protected User(){
    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userFName = builder.userFName;
        this.userLName = builder.userLName;
        this.userRole = builder.userRole;
        this.userPassword = builder.userPassword;
        this.userContact = builder.userContact;
        this.userAddress = builder.userAddress;
        this.dateCreated = builder.dateCreated;
        this.dateUpdated = builder.dateUpdated;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserFName() {
        return userFName;
    }

    public String getUserLName() {
        return userLName;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Contact getUserContact() {
        return userContact;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(userId, user.userId) && Objects.equals(userFName, user.userFName) && Objects.equals(userLName, user.userLName) && Objects.equals(userRole, user.userRole) && Objects.equals(userPassword, user.userPassword) && Objects.equals(userContact, user.userContact) && Objects.equals(userAddress, user.userAddress) && Objects.equals(dateCreated, user.dateCreated) && Objects.equals(dateUpdated, user.dateUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userFName, userLName, userRole, userPassword, userContact, userAddress, dateCreated, dateUpdated);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userFName='" + userFName + '\'' +
                ", userLName='" + userLName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userContact=" + userContact +
                ", userAddress=" + userAddress +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }

    public static class Builder
    {
        private int userId;
        private String userFName;
        private String userLName;
        private String userRole;
        private String userPassword;
        private Contact userContact;
        private Address userAddress;
        private LocalDateTime dateCreated;
        private LocalDateTime dateUpdated;


        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserFName(String userFName) {
            this.userFName = userFName;
            return this;
        }

        public Builder setUserLName(String userLName) {
            this.userLName = userLName;
            return this;
        }

        public Builder setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }

        public Builder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder setUserContact(Contact userContact) {
            this.userContact = userContact;
            return this;
        }

        public Builder setUserAddress(Address userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public Builder setDateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setDateUpdated(LocalDateTime dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.userFName = user.userFName;
            this.userLName = user.userLName;
            this.userRole = user.userRole;
            this.userPassword = user.userPassword;
            this.userContact = user.userContact;
            this.userAddress = user.userAddress;
            this.dateCreated = user.dateCreated;
            this.dateUpdated = user.dateUpdated;
            return this;
        }
        public User build()
        {
           return new User(this);
        }
    }

}
