package four_two_four

/*
    중위 표현식(infix)은 연산자를 이용할 때 많이 사용됨. 연산자를 피연산자의 중간에 놓는다는 개념

    'A + B' 구문에서 A와 B라는 피연산자 사이에 +라는 연산자를 놓을 때 중위 표현식을 사용했다고 표현함
    이런 중위 표현식을 함수 호출에도 사용가능 함

    중위 표현식 사용 가능한 경우
    - 클래스의 멤버 함수로 선언하거나 클래스의 확장(extension) 함수 일 때
    - 매개변수가 하나인 함수일 때
 */

// 함수 확장
infix fun Int.myFun(x: Int): Int {
    return x * x
}

public class FunClass {
    infix fun infixFun(a: Int) {
        println("infixFun call....")
    }
}

fun main(args: Array<String>) {
    val obj = FunClass()
    obj.infixFun(10)

    // 중위 표현식
    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))
}