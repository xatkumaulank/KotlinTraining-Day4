
fun UserInfo(name : String, age : Int, isSunburned : Boolean, isMovieLover : Boolean = true ) : String{ //default argument
    return "$name is $age years old. He/she is $isSunburned sunburned and $isMovieLover movie lover"
}

fun main(){
    println(UserInfo("Hoa",21,false, true))
    println(UserInfo(name ="Hoa2",age=21,isSunburned = true))

}