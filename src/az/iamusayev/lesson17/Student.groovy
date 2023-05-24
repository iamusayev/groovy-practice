package az.iamusayev.lesson17

@groovy.transform.ToString
@groovy.transform.TupleConstructor
//@Mixin(WithId) //Deprecated

import groovy.transform.EqualsAndHashCode
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

@ToString
@TupleConstructor

@Builder
//@Slf4j
//@Mixin(WithId.class)
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    static void main(String[] args) {
        def student = Student.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .build();

        def objects = new TreeSet<>()
        objects.add(new Student("", "", 11))
        objects.add(student)

        println objects
    }


    def methodMissing(String name, Object arguments){
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student where $field = $fieldValue"
    }


    def propertyMissing(String property){
        println "property $property invoked"
    "default value"
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student where $field = $fieldValue"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate
            Closure second = {
                println thisObject // == this
                println owner
                println delegate
            } // declaration

            second() // execution
        }
        closure
    }
}