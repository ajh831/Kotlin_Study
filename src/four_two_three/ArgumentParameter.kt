package four_two_three

/*
    인수(argument) : 함수를 호출하면서 전달하는 값
    매개변수(parameter) : 인수 값을 전달받는 함수의 변수

    기본 인수(default argument) : 호출자가 인수를 명시하지 않아도 피호출자가 알아서 적용하는 기본 값
 */

// 일반적인 함수 선언
//fun sayHello(name: String) {
//    println("Hello!! $name")
//}

// 기본값 적용
//fun sayHello(name: String?) {
//    if(name == null)
//        println("Hello!! Junghoon")
//    else
//        println("Hello!! $name")
//}

// 기본인수 적용
fun sayHello(name: String = "JungHoon") {
    println("Hello!! $name")
}

fun main(args: Array<String>) {
    sayHello() // 기본 인수 적용
//    sayHello(null) // 기본 값 적용
    sayHello("Hani") // 일반적인 함수 선언
}