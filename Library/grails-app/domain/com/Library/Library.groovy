package com.Library

class Library {

String location

String openingHours

String book

String student

String librarian

String toString(){

"$location,$book,$student"

}

    static constraints = {

location()

openingHours()

book()

student()

librarian()

    }
}
