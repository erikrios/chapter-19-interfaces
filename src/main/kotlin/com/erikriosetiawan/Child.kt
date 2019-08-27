package com.erikriosetiawan

class Child : MyInterfaces {
    override val property: Int = 29

    override fun funcOne() {
        super.funcOne()
    }

    override fun bar() {
        print("bar() was canceled")
    }
}
