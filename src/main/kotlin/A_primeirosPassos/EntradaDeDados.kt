package A_primeirosPassos

fun main(){

    println("Qual é o seu nome?")

    var nome: String = readLine()!!.toString()

    println("Olá, $nome. Muito prazer.")
    println("Qual é sua idade?")

    var idade: Int = readLine()!!.toInt()

    println("Sua idade é $idade")
}