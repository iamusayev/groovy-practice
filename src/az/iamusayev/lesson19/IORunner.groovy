package az.iamusayev.lesson19

import groovy.io.FileType

class IORunner {

    static void main(String[] args) {
        def file = new File("README.md")
        println file.text

        file.each { line -> println line }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }
        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        //write
        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "New Line" << System.lineSeparator()
//    file2.withOutputStream {}
//    file2.newOutputStream()
        def srcDir = new File("src")
//        srcDir.eachDir { println it}
//        srcDir.eachDirRecurse { println it}
        srcDir.eachFile { FileType.FILES }
    }
}