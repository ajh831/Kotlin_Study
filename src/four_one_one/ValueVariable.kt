package four_one_one

// 변수 선언법
// val : val(value)은 Assign-once(Read-only) 변수로 한 번 초기화하면 더는 변경할 수 없음
// var : var(variable)는 Mutable 변수는 언제든지 변경 가능

// 변수 선언
val date1: Int = 10
val date2 = 20
var date3 = 30

fun main(args: Array<String>) {
//    date2 = 40    // 에러
    date3 = 40      // 성공

    println("date1 : " + date1)
    println("date2 : " + date2)
    println("date3 : " + date3)
}