## Official Document link for Building a REST application with GORM and Hibernate 5: 
https://guides.grails.org/grails3/rest-hibernate/guide/index.html

## Work with json view : API test

https://views.grails.org/latest/


# Rest Application
## How to build first rest application 

### Syntax :
grails create-app <application_name> --profile rest-api

### Example : 
grails create-app rest-demo --profile rest-api

## How to test the domain class 
grails  test-app rest.demo.ProductSpec

### To open test report : grails open test-report
### test url 
file:///C:/Users/Kundan%20Kumar/Desktop/Learn-Grails/Oreilly/rest-demo/build/reports/tests/index.html

## To get the report of url maping : 
  grails url-mappings-report

## To build view for the controller and domain

  grails generate-views rest.demo.Product



