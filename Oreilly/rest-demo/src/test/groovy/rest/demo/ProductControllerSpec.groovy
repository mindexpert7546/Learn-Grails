package rest.demo
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import rest.demo.ProductController
import grails.test.hibernate.HibernateSpec
import spock.lang.*

@TestMixin(ProductController)
class ProductControllerSpec extends HibernateSpec implements ControllerUnitTest<ProductController> {

    static doWithSpring = {
    jsonSmartViewResolver(JsonViewResolver)
    }
    def setup() {
        Product.saveAll(
        new Product(name: 'Apple', price: 2.0),
        new Product(name: 'Orange', price: 3.0),
        new Product(name: 'Banana', price: 1.0),
        new Product(name: 'Cake', price: 4.0)
    )
    }

    
}