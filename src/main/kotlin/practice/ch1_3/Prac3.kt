package practice.ch1_3

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main() {
    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }
}

// kotlin의 try구문이 자바와 다른 점은 각 블록의 마지막 표현식의 결과값을 반환한다는 것
var a: Int? = try { parseInt("10")} catch (e: NumberFormatException) {null}


data class Person(val name: String)
val person = Person("khd")

// 객체의 값이 null인 경우 엘비스 연산자(?:)를 이용해 예외를 던지는 코드의 예시
val s = person.name ?: throw IllegalArgumentException("Name required")