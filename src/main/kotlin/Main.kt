import javax.naming.Name

fun main() {
    people()
    addition()
    var names= friends("Mary","Gift","Manu")
    println(names)
    cities()




}
fun  people(){
    var people= arrayOf("Juliet","Stephy","Moreen","Akinyi")
    println(people.contentToString())
}
fun addition(){
    var number= arrayOf(32,17,4,213,78,43,31,3,73,11,158,62)
    println(number[1]+number[4])
    println(number[11])
    println(number.sorted())
}
fun friends(friend1: String,friend2: String,friend3: String):String{
    var friendsName= arrayOf(friend1,friend2,friend3)
    return friendsName.contentToString()
}

fun cities (){
    var  cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities)
        println(city.capitalize())

}




