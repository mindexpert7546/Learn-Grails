package com.kundan

class Order {
     //To create the column name 
     Date orderDate;
     Integer orderNumber;
     Float orderTotal;

     //to describe the relationship 
     static hasMany = [orderItem:OorderItem];
     static belongsTo = [customer:Customer];

    static constraints = {
    }
}
