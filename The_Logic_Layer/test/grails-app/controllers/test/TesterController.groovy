package test

class TesterController {

    def index() { }


    //Build Variables

    def variables(){
        def name = "Kundan";
        render ("</br> name : " + name);
        render ("</br> " + name.class);

        def dob = new  Date("10/09/2023");
        render ("</br> dob : " + dob);
        render ("</br>"  + dob.class);
    }

    //build strings
    def strings(){
      def firstName = "Kundan";
      def lastName = "Kumar";
      render firstName+lastName;
      render " </br>you name is $firstName $lastName";

      //calculation string 

      render "Todays Date : ${new Date()}";

      render "How many character is there in you name : ${firstName.length()} </br>";
    }

    //condition 
    def conditions(){
        def name = "Kundan";
        def points = 5;
        def res = "";
        if(points>4){
            res = "This is your point name : ${name}";
        }

        render res;
    }

    
}
