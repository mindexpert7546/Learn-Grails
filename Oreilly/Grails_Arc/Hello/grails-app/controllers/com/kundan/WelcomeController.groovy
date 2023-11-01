package com.kundan

class WelcomeController {

    def index() {
        redirect(action:'greet',params:params)
     }

      def greet() {
        String n = params.name ?:"world"
        render "<h2>Hello $n</h2>"
     }

     def hi(){
        String n = params.name ?:"world"
        // return [user:n]
        [user:n]
     }
}
