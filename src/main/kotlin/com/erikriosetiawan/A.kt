package com.erikriosetiawan

interface A {
    fun notImpelemented()
    fun implementedOnlyInA() {
        print("only A")
    }

    fun implementedInBoth() {
        print("both, A")
    }

    fun implementedInOne() {
        print("implemented in A")
    }
}