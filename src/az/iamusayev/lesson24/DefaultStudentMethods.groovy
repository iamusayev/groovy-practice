package az.iamusayev.lesson24

import az.iamusayev.lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {

        print "$age, $firstName"
    }

    static def anotherMethod(Student self, String value){
        println "$self, arg: $value"
    }
}
