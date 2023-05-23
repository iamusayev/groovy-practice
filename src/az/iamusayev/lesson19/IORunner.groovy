package az.iamusayev.lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        def file = new File("groovy-practice.iml ")
        def text = file.text
        println text

        file.each { line -> print line }

        file.withInputStream {
            def allText = new String(it.readAllBytes())
            print allText
        }
        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "New line" << System.lineSeparator()
        try (def reader = file.newReader()) {
            file2 << reader
        }
//        file2.withOutputStream {}
//        file2.newOutputStream()

        def srcDir = new File("src")
        srcDir.eachDirRecurse {

        }
        srcDir.eachDirRecurse (FileType.FILES){
            println it
        }
    }
}


