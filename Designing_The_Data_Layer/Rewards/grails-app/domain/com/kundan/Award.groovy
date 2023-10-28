package com.kundan

class Award {

     //To create the column name 
     Date awardDate;
     String type;
     Integer points;

     //to describe the relation ship for child here award is child of customer
     static belongsTo = [customer:Customer];
    static constraints = {
    }
}
