package rest.demo

class Product {
    String name
    Double price
    static constraints = {

        name blank:false
        price min: 0.0d, max:10000.0d
    }
}
