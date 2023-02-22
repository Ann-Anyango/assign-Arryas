fun main() {
    people()
    addition()
    student()
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
fun student(){
    var name= arrayOf("prefect","jays","yamy")
    println(name.contentToString())
}
fun cities (){
    var  cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities)
        println(city.capitalize())

}




