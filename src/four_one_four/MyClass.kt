package four_one_four

/*
    myConst 변수를 const 예약어로 선언 => 상수변수
    상수변수는 처음 대입한 값을 변경할 수 없고 변수에 접근하면 항상 같은 값을 반환

    상수변수 const를 이용하는 데 제약사항이 존재
    - var 변수에 사용 불가능(var로 선언한 변수는 값을 변경할 목적으로 사용하기 때문)
    - 함수 내부에서는 const로 변수 선언 불가능(최상위 레벨로 선언하거나 object로 선언한 클래스에서만 사용 가능)

    const 변수는 값을 변경할 수 없어서 클래스의 객체별로 데이터를 다르게 표현할 수도 없는 데 굳이 클래스 내부에 선언할 필요가 없는 것
 */
const val myConst: Int = 10
//const var myConst2: Int = 10    // 에러

class MyClass {
//    const val myConst3: Int = 10    // 에러
}

fun some() {
//    const val myConst4: Int = 10    // 에러
}