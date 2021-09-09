import kotlin.math.max


fun main(){
    //Về cơ bản thì Lambda expression hay gọi tắt là lambdas là một hàm ẩn danh (anonymous function)
    // được định nghĩa bằng hai ký tự {} mà bạn có thể coi là một giá trị.
//    val sayHello = { println("Xin chao")}
//    val sayBye = {name : String -> println("Bye bye $name")}
    val names = mutableListOf("Steve","Tony","Bruce","Thor","T'chala","Clint")
//    names.sortedBy { name : String -> name.length }.forEach { println(it) }
//
//    sayHello()
//    sayBye.invoke("Hòa")
//
    val fun2 : ((String,MutableList<String>) -> Unit)
            = {s, mutableList ->  mutableList.add(s)
            println("Đã add $s vào $mutableList")}

    println(fun2.invoke("Peter",names))
    val sum  = {a:Int ,b:Int -> a+b}
    println(sum.invoke(5,50))
}