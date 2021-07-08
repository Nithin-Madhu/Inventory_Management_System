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

// no arg construct
    Customer(){
        System.out.println("Customer object created through constructor");
    }


// parameterized constructor

    Customer(int _id,String _contactName, String _contactNumber, String _contactMail, String _addressState, String _addressCity, String _addressStreet, int _getTransaction ){
        id = _id;
        contactName = _contactName;
        contactNumber = _contactNumber;
        contactMail = _contactMail;
        addressState = _addressState;
        addressCity = _addressCity;
        addressStreet = _addressStreet;
        getTransaction =_getTransaction;
    }

    // copy constructor

    Customer(Customer customer2){

        id = customer2.id;
        contactName = customer2.contactName;
        contactNumber = customer2.contactNumber;
        contactMail = customer2.contactMail;
        addressState = customer2.addressState;
        addressCity = customer2.addressCity;
        addressStreet = customer2.addressStreet;
        getTransaction =customer2.getTransaction;

    }



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
