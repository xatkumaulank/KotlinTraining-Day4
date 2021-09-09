import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

//Kotlin standard library cung cấp Scope function với mục đích duy nhất là xử lý 1 đoạn code trong context của object.
//Scope function lấy tham số là 1 function của 1 object. Khi sử dụng, chúng ta có thể:
//1, thay thế function đó bằng cách truyền vào lambada expression.
//2, truy cập vào object của function mà không cần định nghĩa name cho nó.
//Kotlin cung cấp cho 5 loại scope function là let, run, with, apply và also.
//Làm cho code dễ đọc hơn

//Return Value
//1. Lambda result : let, run, with
//2. Context Object : also, apply


//Context Object:
//1. it: let, also
//2. this: run, with, apply

fun letFunction(){
    Person("Hòa",21,"Hà nội").let { person ->
        person.printInfo()
        person.moveTo("Hồ Chí Minh")
        person.incrementAge()
        person.printInfo()
    }
    val person2 : Person? = null
    person2?.let { person ->
        person.printInfo()
    }
    val numbers = mutableListOf("one", "two", "three", "four", "five", "six")
    numbers.map { it.length }.filter { it > 3 }
        .let { println(it) }
}
fun runFunction(){
    Person("Hòa",21,"Hà nội").run {
        this.printInfo()
        this.moveTo("Hồ Chí Minh")
        this.incrementAge()
        this.printInfo()
    }
    val person2 : Person? = null
    person2?.run {
        this.printInfo()
    }
    val numbers = mutableListOf("one", "two", "three", "four", "five", "six")
    numbers.map { it.length }.filter { it > 3 }
        .run { println(this) }
}
fun withFunction(){
    val person = Person("Hòa",21,"Hà nội")

    with(person){
        println(this.printInfo())
        this.moveTo("Hồ Chí Minh")
        this.incrementAge()
        println(this.printInfo())
    }

    val numbers = mutableListOf("one", "two", "three", "four", "five", "six")
    with(numbers.map{ it.length }.filter { it > 3 }){
        println(this)
    }
}
fun applyFunction(){
    Person("Hòa",21,"Hà nội").apply {
        this.printInfo()
        this.moveTo("Hồ Chí Minh")
        this.incrementAge()
        this.printInfo()
    }
}
fun alsoFunction(){
    Person("Hòa",21,"Hà nội").also { person ->
        person.printInfo()
        person.moveTo("Hồ Chí Minh")
        person.incrementAge()
        person.printInfo()
    }
}
fun main(){
    letFunction()
    runFunction()
    withFunction()
    applyFunction()
    alsoFunction()
}
data class Person(var name: String, var age: Int =0, var city: String = "") {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
    fun printInfo(){
        println("Your name is $name and $age years old in $city city")
    }
}


