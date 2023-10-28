package com.kundan

class OorderItem {
     //To create the column name 
     Integer qty;
     Float total;

     //to describe the relationship 
     static belongsTo = [order:Order,product:Product];
    static constraints = {
    }
}
