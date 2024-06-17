package four_two_two

/*
    함수의 오버로딩이란, 같은 이름의 함수를 매개변수 부분(개수 또는 타입)을 다르게 하여 여러 개 정의하는 기법
 */

fun some(a: String) {
    println("some(a: String) call....")
}

fun some(a: Int) {
    println("some(a: Int) call....")
}

fun some(a: Int, b: String) {
    println("some(a: Int, b: String) call....")
}

fun main(args: Array<String>) {
    some("hello")
    some(10)
    some(10, "hello")
}