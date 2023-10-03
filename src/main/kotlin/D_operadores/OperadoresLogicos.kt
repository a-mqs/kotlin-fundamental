package D_operadores

fun main(){
    var valorA: String = "Brasília"
    var valorB: String = "Campo Grande"
    var valorC: String = "Manaus"

    println("ValorA é igual a ValorB? (expressão 1):")
    println(valorA.equals(valorB))

    println("ValorA é igual a ValorC? (expressão 2):")
    println("${valorA.equals(valorC)}\n")


    println("Então, baseado nos resultados, o que é expressão1 AND expressão2?:")
    println((valorA.equals(valorB) && valorA.equals(valorC)))

    println("E o que é expressão1 OR expressão2?:")
    println((valorA.equals(valorB) || valorA.equals(valorC)))

    println("E expressão1 é diferente de expressão2?:")
    println((valorA.equals(valorB) != valorA.equals(valorC)))


}