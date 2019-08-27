package com.erikriosetiawan

interface MyInterfaces {
    val property: Int

    val propertyWithImplementation: String
        get() = "Foo"

    fun foo() {
        print(property)
    }

    fun funcOne() {
        // optional body
        print("Function with default implementation")
    }

    fun bar()
}