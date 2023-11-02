package com.iinterchange

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class CastleSpec extends Specification {

   void "Verify the longi/latti " (){
        given:
        Castle google = new Castle(name:'Google',city:'Mountian',state:'CA')

        when:
        service.fillLanLt(google)

        then:
        (google.latitude-37.4).abs()<0.1
        (google.longitude - -122.1).abs()<0.1
    }
}
