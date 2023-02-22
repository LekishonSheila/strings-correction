fun main() {
    school()
    val sentence = name("Sheila", 19)
    println(sentence)
    val string = "sheila, lekishon"
    val length = stringLength(string)
    println(length)
    checkName("sheila")
    checkName("wendy")
}
fun school() {
    val school = "AkiraChix"
    val schoolname=("${school[0]}${school[2]}${school[3]}")
    println(schoolname)
}

fun name(name: String, age: Int): String {
    return "Hi, my name is $name and I am $age years old"
}
fun stringLength(name: String): Int {
    return name.length
}
fun checkName(personname: String ):String {
    if(personname == "sheila"){
        println("thats me")
        }
    else{
        println("i dont know who that is")
    }
    return personname
}




