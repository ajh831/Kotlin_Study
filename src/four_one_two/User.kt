package four_one_two

/*
    변수 선언은 최상위(클래스 외부), 클래스 내부, 함수 내부에 할 수 있음
    변수는 자동 초기화되지 않으므로 직접 초기화 해야되며, 최기화 후에 이용할 수 있음
    최상위 레벨이나 클래스의 멤버 변수는 반드시 선언과 동시에 초기화를 해주어야 하며,
    함수 내부의 지역변수는 선언과 동시에 초기화하지 않더라도 이후 별도로 초기화해야 사용할 수 있음
 */

//val topData1: Int // 에러(원인 : 초기화 하지 않음)
//var topData2: Int // 에러(원인 : 초기화 하지 않음)

class UserError {
//    val objData1: String // 에러(원인 : 초기화 하지 않음)
//    val objData2: String // 에러(원인 : 초기화 하지 않음)

    fun some() {
        val localData1: Int     // 성공
        var localData2: String  // 성공

//        println(localData1) // 에러(원인 : 초기화 하지 않음)

        localData2 = "hello 4.1.2 변수 초기화 : 에러 상황"    // 성공
        println(localData2)


    }
}

class UserSuccess {
    val objData1: String = "hello"
    val objData2: String = "hello"

    fun some() {
        val localData1: Int     // 성공
        var localData2: String  // 성공

        localData1 = 40
        println(localData1) // 에러(원인 : 초기화 하지 않음)

        localData2 = "hello 4.1.2 변수 초기화 : 정상 상황"    // 성공
        println(localData2)


    }
}

fun main(args: Array<String>) {
    val userError = UserError()
    userError.some()
    val userSuccess = UserSuccess()
    userSuccess.some()
}