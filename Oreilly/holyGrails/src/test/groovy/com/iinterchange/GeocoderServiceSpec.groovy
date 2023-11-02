package com.iinterchange

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
class GeocoderServiceSpec extends Specification implements ServiceUnitTest<GeocoderService>{

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
