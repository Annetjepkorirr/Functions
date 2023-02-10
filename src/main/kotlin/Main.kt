fun main() {
    greetPerson(name = "Jane")
   var modulus = division(178, 34,)
    println(modulus)

    var sum = addition(45, 67, 67, 87 )
    println(sum)
    letters("Cooking")


}
fun greetPerson(name: String){
    println("Hello $name")

}
//modulus
fun division(num1: Int ,num2: Int): Int{
    var modulus = num1 % num2
    return modulus
}

//addition
fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 +num3 + num4
    return sum

}
fun letters(name: String){
    println("Hello, an Interesting thing about me is  $name")

}











