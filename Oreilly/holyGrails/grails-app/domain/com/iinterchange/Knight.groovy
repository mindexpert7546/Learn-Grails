package com.iinterchange

class Knight {
    String title
    String name
    Quest quest 
    Castle castle 

    String toString{"$title $name"}
    static constraints = {
        title inList: ['Sir','Lord','King','Queen','Lady']
        name blank:false
        quest nullable :true 
        Castle nullable:true

    }
}
