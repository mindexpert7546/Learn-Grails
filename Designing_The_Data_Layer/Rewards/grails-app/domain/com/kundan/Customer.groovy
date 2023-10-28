package com.kundan

class Customer {

    //To create the column name 
    String firstName;
    String lastName;
    Long phone;
    String email;
    Integer totalPoints;

    //to describe the relation ship here customer has many award and order so

    static hasMany = [awards:Award, orders:Order];//we describe here static because for every customer value will be same 
    
    static constraints = {
    }
}
