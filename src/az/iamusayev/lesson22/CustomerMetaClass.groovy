package az.iamusayev.lesson22

import java.lang.reflect.Field
import java.lang.reflect.Method

class CustomerMetaClass {
    Map<String, Method> methods = new HashMap<>();
    Map<String, Field> fields = new HashMap<>();
}
