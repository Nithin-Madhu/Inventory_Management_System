package com.ims;

public class Customer {

    int id;
    String contactName;
    String contactNumber;
    String contactMail;
    String addressState;
    String addressCity;
    String addressStreet;
    int getTransaction;

    String getContactDetails(){
        return contactName + ", " + contactNumber + ", " + contactMail;
    }

    String getAddressDetails(){
        return addressState + ", " + addressCity + ", " + addressStreet;
    }

    int getTransactionCount(){
        return getTransaction;
    }

    float calculateDiscount(){
        float discount = getTransaction * 0.1f;
        return discount <= 10.0f ? discount : 10.0f;
    }


}
