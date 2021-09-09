import kotlin.text.Typography.times

//I. High-order function là function mà lấy một function khác làm tham số, hoặc return về một function
fun exampleHighOrderFunction(){
    val items = listOf(1, 2, 3, 4, 5)
    items.fold(0) { acc: Int, i: Int ->
        print("acc = $acc , i = $i")
        val result = acc + i
        println(" result = $result")
        result
    }

    val joinedToString = items.fold("Elements:") { acc, i -> "$acc $i" }
    println(joinedToString)
}
fun exampleHighOrderFunction2(name : String, helloFunction: (String) -> Unit){
    print("Xin chào ")
    helloFunction(name)
}
fun returnAddFunction() : ((Int,Int) -> Int){
    return ::addFunction
}
fun addFunction(a : Int, b : Int) : Int{
    return a + b
}
var abc = fun(s: String): Int { return s.toIntOrNull() ?: 0 }
fun main(){
//    println(abc.invoke("10"))
//    exampleHighOrderFunction()
//    exampleHighOrderFunction2("Hòa") { s: String -> println("$s đẹp trai") }
//    println(returnAddFunction().invoke(1,6))
//    val a = {i:Int -> i+1}
//    println(a.invoke(15))

    val repeatFun : String.(Int) -> String = {times -> this.repeat(times)}
    println(repeatFun.invoke("hoa",3)) // tương đương với println("hoa".repeat(3))

}