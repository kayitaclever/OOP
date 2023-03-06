fun main() {
    var body= Human("Cynthia",25,55)
        body.eat(1)
    println(body.weight)
    body.speak("what's the weather today")
    body.bithday()
    println(body.age)

    var student= User("Ivy","kabonge","ivykabonge@gmail.com","+258648","4847")

        println(student.lastname)
    println(student.email)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat (foodWeight: Int){
        weight+= foodWeight
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun bithday(){
        age++

    }
}
class User(var firstname:String, var lastname:String, var email:String, var phoneNumber:String,var password:String){


}



