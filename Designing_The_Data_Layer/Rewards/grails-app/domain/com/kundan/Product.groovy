package com.kundan

class Product {

    //To create the column name 
    String name;
    String sku;
    Float price;

    //to describe the relationship 
    static hasMany = [orderItem:OorderItem];

    static constraints = {
    }
}
