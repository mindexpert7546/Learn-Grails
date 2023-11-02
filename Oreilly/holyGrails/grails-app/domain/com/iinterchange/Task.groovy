package com.iinterchange
// @ToString(includes = ['name','priority','completed']) 
class Task {

    String name
    int priority = 3
    Date startDate = new Date()
    Date endDate = new Date()
    boolean completed
    static belongsTo = [quest:Quest]

    int getDuration(){
        endDate-startDate+1
    }

    static transients = ['duration']
    static constraints = {
        name(blank:false)
        priority range: 1..5
        startDate()
        endDate validator:{
            val,task ->
            val >= task.startDate
        }
        completed()

    }
}
