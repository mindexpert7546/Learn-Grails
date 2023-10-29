package serviceandcontroller

import grails.transaction.Transactional

@Transactional
class TestService {

//to creating the service method 
    def welcome(params) {
        //defination of first variables and second variables 
        //and passes the params. means which value will be pass to welcome method welcome(p) then p.first here first will be called in url

      def firstName = params.first;
      def totalPoints = params.points.toInteger();

      //empty string to get the result 
      def welcomeMessage = "";

      //switch conditon based on params
      switch(totalPoints){
        case 5 :
           welcomeMessage = "welcome back $firstName . This drink is on us ."
           break;
        case 4 : 
           welcomeMessage = "Welcome back $firstName . Your next dringk is free."
           break;
        case 2..3:
           welcomeMessage = "welcome back $firstName . You now have $totalPoints points."
           break;
        default : 
           welcomeMessage = "welcome $firstName. Thank you fro registering. "
           break;
      }
    }
}
