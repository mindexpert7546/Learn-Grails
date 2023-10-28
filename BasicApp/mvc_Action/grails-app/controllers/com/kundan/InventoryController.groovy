package com.kundan

class InventoryController {

    def index() {
        render "Here is a list of everything.";
     }

    def remove(){
        render "You have one less than before.";
    }

    // for the view 
    def edit(){
        def name='Kundan';
        def place="Bihar";

        [name:name,place:place];
    }

    def list(){
        def allProducts = Product.list();
        [allProducts:allProducts];
    }
}
