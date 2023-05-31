package az.iamusayev.lesson22

import az.iamusayev.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomerMetaClass()
//        println "Hello"

        def method = DefaultGroovyMethods.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)


        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "test2")

        //MetaClassImpl - основная реализация Metaclass

        //Expando
        student.metaClass.abc = "Test property"
        student.metaClass.test= {
            println "It's a new method"
        }

        student.test()

        println student.metaClass

        student.class.metaClass.newMethod={
            println "New method in class student"
        }
        new Student().newMethod()

    }

}
