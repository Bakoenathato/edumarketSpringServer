package za.ac.cput.domain.contactinfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Contact
{
    @Id
    private String studentEmail;
    private String cellNumber;


    protected Contact() {
    }

    private Contact(Builder builder) {
        this.studentEmail = builder.studentEmail;
        this.cellNumber = builder.cellNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(studentEmail, contact.studentEmail) && Objects.equals(cellNumber, contact.cellNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentEmail, cellNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "studentEmail='" + studentEmail + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String studentEmail;
        private String cellNumber;

        public Builder setStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder copy(Contact userCont){
            this.studentEmail = userCont.studentEmail;
            this.cellNumber = userCont.cellNumber;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}
