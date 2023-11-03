package rest.demo

class BootStrap {

    def init = { servletContext ->
        new Product(name: 'Apple', price: 2.0).save()
        new Product(name: 'Orange', price: 3.0).save()
        new Product(name: 'Banana', price: 1.0).save()
        new Product(name: 'Cake', price: 4.0).save()
    }
    def destroy = {
    }
}
