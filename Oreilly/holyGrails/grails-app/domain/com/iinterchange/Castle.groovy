package com.iinterchange

class Castle {

    String name
    String city
    Stirng state
    double latitude
    double longitude

    String toString(){"$name Castle"}
    static hasMany = [knights:Knight]
    static constraints = {
        name blank:false
        city blank:false
        state blank:false
        latitude min:-90d, max:90d
        longitude()
    }
}
