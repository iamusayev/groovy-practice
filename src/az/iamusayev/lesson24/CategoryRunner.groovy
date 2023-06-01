package az.iamusayev.lesson24

import az.iamusayev.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr();
            student.anotherMethod("Test arg");
        }

        student.anotherMethod();
        student.testStr();
    }
}
