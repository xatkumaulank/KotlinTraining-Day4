


fun main(){
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

}