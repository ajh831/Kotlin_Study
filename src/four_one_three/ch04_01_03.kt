package four_one_three

import java.util.Objects.nonNull

/*
    null 값을 대입하려면 명시적으로 null이 될 수 있느 (nullable) 변수로 선언해야 함
    코틀린은 null을 대입할 수 없는 변수와 있는 변수로 구분하여 사용함
    null 안전성이라고 부르며 null에 안전한 프로그램을 작성하기 위한 기법임
    ? 기호를 추가해야 null을 대입할 수 있음
    val 변수는 한 번 초기화 후 값을 변경할 수 없는 읽기 전용 변수이므로 값을 재할당하게 되면 에러가 발생함
    var 변수는 값 재할당이 가능함

    따라서 초기값으로 null을 대입하고 이 후 값을 재할당 하기 위해서는 ? 기호를 이용하여 null이 될 수 있음을 명시하고,
    변수의 값을 재할당 해주기 위하여 var로 선언해야 함
 */

//val nonNullData: String = null    // 에러
val nullableData1: String? = null
var nullableData2: String? = null

fun main(array: Array<String>) {
//    nullableData1 = "hello"  // 에러
    nullableData2 = "hello2"

    println("nullableData1: $nullableData1")
    println("nullableData2: $nullableData2")
}