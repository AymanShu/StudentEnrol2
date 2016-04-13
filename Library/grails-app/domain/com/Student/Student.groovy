package com.Student

class Student {

String name

String email

String studentId

String course

String toString(){

"$name,$studentId,$course"

}

    static constraints = {

studentId()

name()

email()

course()
    }
}
