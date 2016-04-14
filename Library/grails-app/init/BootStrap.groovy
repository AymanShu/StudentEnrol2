import com.Library.*

class BootStrap {

    def init = { servletContext ->

def student1=new Student(name:'Andy',
email:'Andy@shu.ac.uk',
studentId:'123456B',
course:'Development').save()

def student2=new Student(name:'Bob',
email:'Bob@shu.ac.uk',
studentId:'123456C',
course:'Development').save()

def student3=new Student(name:'Colin',
email:'Colin@shu.ac.uk',
studentId:'123456D',
course:'Development').save()

def librarian1=new Librarian(name:'Andrew',
email:'Andrew@shu.ac.uk',
userName:'AndrewShu',
password:'123',
telephone:'012345').save()

def librarian2=new Librarian(name:'Bobby',
email:'Bobby@shu.ac.uk',
userName:'BobbyShu',
password:'234',
telephone:'0123456').save()

def librarian3=new Librarian(name:'Cole',
email:'Cole@shu.ac.uk',
userName:'ColeShu',
password:'345',
telephone:'01234567').save()

def library1=new Library(location:'Loc1',
openingHours:'9-5',
book:'Harry Potter',
student:'Ali',
librarian:'Alistar').save()

def library2=new Library(location:'Loc2',
openingHours:'9-4',
book:'Hunger Games',
student:'Billy',
librarian:'Bill').save()

def library3=new Library(location:'Loc3',
openingHours:'9-3',
book:'Song of Ice and Fire',
student:'Casper',
librarian:'Carlos').save()

def book1=new Book(tittle:'Harry Potter',
author:'JK Rowling',
isbn:'789',
dateBorrowed:'13/04/16',
returnDate:'15/04/16',
student:'Dave').save()

def book2=new Book(tittle:'Hunger Games',
author:'Suzanne Colins',
isbn:'987',
dateBorrowed:'12/04/16',
returnDate:'14/04/16',
student:'Nathan').save()

def book3=new Book(tittle:'Song of Ice and Fire',
author:'George R R Martin',
isbn:'654',
dateBorrowed:'14/04/16',
returnDate:'20/04/16',
student:'Alex').save()

def course1=new Course(title:'Personal Development',
code:'159',
tutor:'Tonderai',
department:'ACES',
description:'Course for developing yourself').save()

def course2=new Course(title:'Web Design',
code:'951',
tutor:'Martin',
department:'ACES',
description:'Course for designing websites').save()

def course3=new Course(title:'Accounting',
code:'753',
tutor:'Eric',
department:'Maths',
description:'Using maths to handle money and accounts').save()

	}
    def destroy = {
    }
}
