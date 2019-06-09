package com.ucsdextandroid1.kotlinlist

class JavaUnitText {
    private fun helloWorld(): String {
        return "Hello World"
    }

    private fun doSomething() {

    }

    inner class PropetryDemo {
        var count: Int = 0
            private set
        var propertyWithCounter: String? = null
            set(propertyWithCounter) {
                this.count += 1
                field = propertyWithCounter
            }
    }
}


