package com.ims;

public class Main {
    public static void main(String[] args) {

        // Creating object of Product class and accessing them.

        Product laptop = new Product();

        laptop.id = 1;
        laptop.name = "Dell";
        laptop.salesPrice = 80000.0f;
        laptop.cost = 50000.0f;
        laptop.quantity  = 200;
        laptop.active = true;

        float profit = laptop.getProfitOrLoss();
        System.out.println("Profit :" + profit);

        laptop.deactivate();
        System.out.println(laptop.active);

        // Creating object of Customer class and accessing them.

        Customer customer = new Customer();

        customer.contactName = "John";
        customer.contactNumber = "1234567890";
        customer.contactMail = "john@yahoo.com";
        customer.addressState = "Maharashtra";
        customer.addressCity = "Mumbai";
        customer.addressStreet = "Andheri street";
        customer.getTransaction = 20;

        System.out.println(customer.getTransactionCount());
        System.out.println(customer.getAddressDetails());
        System.out.println(customer.getContactDetails());

        // Creating object of Order class and accessing them.

        Order order = new Order();

        order.id =1;
        order.vendor = "apple";
        order.date = "May 5th 2020";
        order.orderedProduct = "Macbook";
        order.orderedQuantity= 200;
        order.amountPaid = 100000.0f;

        System.out.println("We have ordered " + order.orderedQuantity +" "+ order.vendor +" "+ order.orderedProduct + " on " + order.date);


        // Creating object of Vendor class and accessing them.

        Vendor vendor = new Vendor();

        vendor.contactName = "Bob";
        vendor.contactNumber = "0987654321";
        vendor.contactMail = "bob@hotmail.com";
        vendor.addressState = "Karnataka";
        vendor.addressCity = "Bangalore";
        vendor.addressStreet = "MG road";
        vendor.product = "Macbook";

        System.out.println(vendor.product);
        System.out.println(vendor.getAddressDetails());
        System.out.println(vendor.getContactDetails());

        System.out.println("*******************************************");

        // parameterized constructor object

        Customer customer1 = new Customer(1,"Clark","0123456789","clark@superman.com","Florida","Miami","M city",560000);
        System.out.println(customer1.id);
        System.out.println(customer1.contactName);
        System.out.println(customer1.contactNumber);
        System.out.println(customer1.addressCity);

        System.out.println("Above we have parametrized constructors data and Below is its copy constructor");


        // object of copy constructor

        Customer customer2 = new Customer(customer1);

        System.out.println(customer1.id);
        System.out.println(customer1.contactName);
        System.out.println(customer1.contactNumber);
        System.out.println(customer1.addressCity);








    }
}
