package com.Book

class Book {

String tittle

String author

String isbn

String dateBorrowed

String returnDate

String student

String toString(){

"$tittle,$isbn,$student"

}

    static constraints = {

tittle()

author()

isbn()

student()

dateBorrowed()

returnDate()
    }
}
