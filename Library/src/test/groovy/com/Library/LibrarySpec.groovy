package com.Library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	void toString(){
when:"A Library has location,book and student."

def library=new Library(location:'Room 1',

book:'Harry Potter',

student:'Joey')

then:"the to String method will merge them."

library.toString()=='Room 1,Harry Potter,Joey'

}
}
