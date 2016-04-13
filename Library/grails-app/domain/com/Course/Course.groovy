package com.Course

class Course {

String title

String code

String tutor

String department

String description

String toString(){

"$title,$code,$tutor"

}

    static constraints = {

code()

title()

department()

tutor()

description()

    }
}
