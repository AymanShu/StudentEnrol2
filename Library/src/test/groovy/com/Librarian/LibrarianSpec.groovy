package com.Librarian

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A Librarian has name,email and username"

def librarian=new Librarian(name:'Joe',

email:'joe@shu.ac.uk',

userName:'JoeShu')

then:"the to String method will merge them."

librarian.toString()=='Joe,joe@shu.ac.uk,JoeShu'
    }
}
