package practice.ch1_2


fun ifElsePrac1() {
    val dollar = 4
    var status: String = ""

    if (dollar >= 4) {
        status = "부자"
    } else {
        status = "안부자"
    }
}

fun ifElsePrac2() {
    val dollar = 4
    val status = if (dollar >= 4) {
        "부자"
    } else {
        "안부자"
    }
}

fun ifElsePrac3() {
    val dollar = 4
    val status = if (dollar > 4) "부자" else "안부자"
}

fun whenPrac1() {
    val english = "blue"
    var korean: String = ""

    when(english) {
        "blue" -> korean = "파랑"
        "red" -> korean = "빨강"
        "pink" -> korean = "분홍"
        "4 dollar" -> korean = "사딸라"
        else -> korean = "없음"
    }

    println(korean) //파랑
}

fun whenPrac2() {
    val x = 5

    when(x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}


fun whenPrac3() {
    data class Person(val name: String, val age: Int)

    val person = Person("Hama", 12)

    when (person) {
        Person("Girin", 13) -> print("The name is Girin")
        Person("Hama", 12) -> print("The name is Hama")
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun whenPrac4() {
    val x = (1..10).random()
    val y = when {
        x in 1..5 -> x * 2
        x in 6..10 -> x + 100
        else -> 0
    }

    print(y)
}

fun forPrac() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

fun main() {
    forPrac()
}
