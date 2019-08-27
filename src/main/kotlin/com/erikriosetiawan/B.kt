package com.erikriosetiawan

interface B {
    fun implementedInBoth() {
        print("both, B")
    }

    fun implementedInOne() // only defined
}