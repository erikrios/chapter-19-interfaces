package com.erikriosetiawan

class MyClass : MyInterface, A, B {
    override fun notImpelemented() {
        print("Normal inplementation")
    }

    override fun implementedInBoth() {
        super<B>.implementedInBoth()
        super<A>.implementedInBoth()
    }

    override fun implementedInOne() {
        super<A>.implementedInOne()
        print("implementedInOne class implementation")
    }
}