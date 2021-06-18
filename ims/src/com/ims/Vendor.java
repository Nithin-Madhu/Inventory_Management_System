package com.ims;

public class Vendor {

    int id;
    String contactName;
    String contactNumber;
    String contactMail;
    String addressState;
    String addressCity;
    String addressStreet;
    float credit;
    String product;
    float checkDue;

    int getProductById(int id){
        return id;
    }

    String getProductByName( String product){
        return product;
    }


    String getContactDetails(){
        return contactName + ", " + contactNumber + ", " + contactMail;
    }

    String getAddressDetails(){
        return addressState + ", " + addressCity + ", " + addressStreet;
    }

}
