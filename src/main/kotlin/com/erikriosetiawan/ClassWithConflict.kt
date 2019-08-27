package com.erikriosetiawan

class ClassWithConflict : FirstTrait, SecondTraint {
    override fun foo() {
        super<FirstTrait>.foo() // delegate to the default implementation of FirstTrait
        super<SecondTraint>.foo() // delefate to the default implementation of SecondTrait
    }

    override fun bar() {

    }
}