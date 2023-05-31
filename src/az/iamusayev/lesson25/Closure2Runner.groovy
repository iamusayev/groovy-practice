package az.iamusayev.lesson25

import az.iamusayev.lesson17.Student

class Closure2Runner {

    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        closure.thisObject
        closure.owner
        closure.delegate

        def student = new Student("Ivan", "Ivanov", 29)
        println student

        closure.delegate = student

        student.with {closure}
        closure()
        println student
    }
}
