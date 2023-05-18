package az.iamusayev.lesson26.task1

import az.iamusayev.lesson17.Student

 /**
 * Add a "make" initialization method to create objects of any classes.
 The method must proxy the call to the corresponding constructor
 */
class Task1 {

    static void main(String[] args) {
//        new HashSet<>([1, 2, 3, 4, 4])
        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate // import!

            delegate.metaClass.invokeConstructor(values)
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 4])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()

        println hashSet
        println student
        println student2
    }
}