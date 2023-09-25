package C_FormatarNumeros

fun main(){

    val numero = 10

    val saidaFormatada = String.format("%012d", numero)

    val soma = saidaFormatada.toInt() + saidaFormatada.toInt()
    val concatenacao = saidaFormatada + saidaFormatada

    println("Número: $numero")
    println("Padrão de formatação: $saidaFormatada")
    println("Soma: $soma")
    println("Concatenação: $concatenacao")

}