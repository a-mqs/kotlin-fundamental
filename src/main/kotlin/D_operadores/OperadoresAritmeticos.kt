package D_operadores

fun main(){

    var valorA = 10
    var valorB = 3

    println("Soma: ${valorA.plus(valorB)}")
    println("Subtração: ${valorA.minus(valorB)}")
    println("Multiplicação: ${valorA.times(valorB)}")
    println("Divisão: ${valorA.div(valorB)}")

    valorA += valorB
    println("Soma comum (valorA += valorB [nada novo sob o sol]): $valorA")

}