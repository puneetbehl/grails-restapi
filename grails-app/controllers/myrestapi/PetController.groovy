package myrestapi


import grails.rest.*
import grails.converters.*

class PetController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PetController() {
        super(Pet)
    }
}
