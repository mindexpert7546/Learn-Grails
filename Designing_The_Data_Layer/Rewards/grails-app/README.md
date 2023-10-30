     //to describe the relation ship for child here award is child of customer Awards.groovy
     static belongsTo = [customer:Customer];

     
      //to describe the relationship  OrderItem.groovy 
     static belongsTo = [order:Order,product:Product];

      //to describe the relation ship here customer has many award and order so - > customer.groovy

    static hasMany = [awards:Award, orders:Order];//we describe here static because for every customer value will be same 


      //to describe the relationship  Order.groovy
     static hasMany = [orderItem:OorderItem];
     static belongsTo = [customer:Customer]; 


      //to describe the relationship  Product.groovy
    static hasMany = [orderItem:OorderItem]

![Screenshot 2023-10-28 223358](https://github.com/mindexpert7546/Learn-Grails/assets/89348788/0c9ba047-4160-4e69-a1dc-b3afe67d9624)
