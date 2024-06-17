package four_one_four

/*
    상수변수 : 처음에 대입한 초깃값을 변경하지 않고 그대로 사용하는 변수
    val 예약어로 선언한 변수를 상수변수는 아님. 초깃값을 대입하면 항상 동일한 값을 반환해야 상수변수라고 할 수 있음.
    val로 선언한 변수는 값을 다르게 반화할 수 있음

    코틀린에서 변수는 프로퍼티(property)임.
    val로 선언한 변수의 초깃값을 직접적으로 변경할 수는 없지만, 해당 변수의 get() 함수에서 어떻게 처리하느냐에 따라 다른 값이 나오게 할 수 있음.
 */

var myBool = false;
val myVal: String = "hello"
    get() {
        if(myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main(args: Array<String>) {
    println(myVal)
    myBool = true
    print(myVal)
}