package four_two_three

fun sayHello(name: String = "JungHoon", no: Int) {
    println("Hello!! $name")
}

fun main(args: Array<String>) {
//    sayHello(10)    // 에러(어느 매개변수에 대입할지 모름)
    sayHello("An", 20)
    sayHello(no = 10)
    sayHello(name = "An", no = 10)
}