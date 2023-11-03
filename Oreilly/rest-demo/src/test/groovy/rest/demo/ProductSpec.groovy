package rest.demo

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.hibernate.HibernateSpec
import rest.demo.Product

@TestFor(Product)
class ProductSpec extends HibernateSpec {

   void 'test domain class validation'() {
    given:
    Product p = new Product()
    when:
    p.save()
    
    then: 
    p.hasErrors()
    p.errors.getFieldError('price')
    p.errors.getFieldError('name')
    p.count() == 0
  }

  void 'Test the validation of class'(){
    given:
    Product p = new Product(name:'Banana',price:10.5d)

    when:
    p.save()

    then:
    Product.count()==1
    Product.first().name == 'Banana'

  }
}
