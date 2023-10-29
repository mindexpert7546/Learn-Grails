package serviceandcontroller

class TestController {

   // Here I have called testService class but make sure first letter will be small 
   // here TestService which is service class has 
   // first small letter of calling
    def testService;


    def index() { 

        //call to the welcome method from the testService class 
        // within the method params is necessary
        def welcomeMessage = testService.welcome(params);

        //to render the message
        render welcomeMessage;
    }
}
