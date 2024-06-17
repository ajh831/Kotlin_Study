package four_two_one

/*
    함수를 선언할 때 매개변수 부분에 var, val을 선언할 수 없음
    함수의 매개변수는 무조건 val로 적용됨. 즉, 함수 내에서 매개변수 값을 변경할 수 없다는 뜻
    함수 선언에서 의미있는 반환값이 없을 때는 Unit으로 명시함(생략 가능)

    함수 내에 함수 정의 또한 가능함(중첩 함수)
    함수를 중첩해서 사용한 경우 외부에서 내부 함수를 호출할 수 없음

    함수 선언 때 단일 구문으로 값을 반환하는 함수라면 중괄호 {}를 생략하고, 등호 =을 이용해 쉽게 정의할 수 있음
    단일 구문으로 값을 반환하는 함수는 함수 내의 내용이 값을 반환하는 한 줄로 작성된 함수를 의미함
    ex)
        fun some(a: Int, b: Int): Int {
            return a + b
        }

    단일 표현 함수는 반환 타입도 생략할 수 있음(컴파일러가 유추)
    ex)
        func some(a: Int, b: Int) = a + b
 */

fun sum(a: Int, b: Int): Int {
    var sum = 0
    fun calSum() {
        for (i in a..b) {
            sum += i
        }
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    val result = sum(1, 10)
    println(result)
}