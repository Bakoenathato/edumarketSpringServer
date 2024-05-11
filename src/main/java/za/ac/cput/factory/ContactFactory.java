package za.ac.cput.factory;

import za.ac.cput.domain.contactinfo.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory
{
    public static Contact buildContact(String studentEmail, String cellNumber){
        if (!Helper.isValidEmail(studentEmail) || Helper.isInvalidPhoneNumber(cellNumber))
            return null;
        return new Contact.Builder()
                .setStudentEmail(studentEmail)
                .setCellNumber(cellNumber)
                .build();
    }
}
