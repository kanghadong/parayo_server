package practice.ch1_4

fun NullPrac1() {
    // 코틀린에서 String과 같은 일반적인 타입은 널값을 가질수 없다.
    var a: String = "Kotlin"
    // a = null // 컴파일 에러

    // 널값을 가질수 있는 객체를 선언하려면 타입뒤에 ?를 붙여준다.
    var b:String? = "Kotlin"
    b = null
}

fun makeSomething(): String {
    return "makeSomething"
}

fun NullPrac2() {
    val b: String? = makeSomething()
    val l = if (b != null) b.length else -1
}

fun NullPrac3() {
    val b: String? = makeSomething()
    val l = b?.length // 이 경우 l의 타입은 널을 가질수 있는 Int? 가 된다.
}

fun NullPrac4() {
    val b: String? = makeSomething()
    val l = b?.length ?: -1 // l의 타입은 Int
}

fun NullPrac5() {
    val b: String? = null
    val l = b!!.length // l의 타입은 Int가 되지만 여기세어 NPE 발생
}