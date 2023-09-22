package B_tiposDeDados

import java.util.*

fun main(){
    val cidade = "são paulo"

    println("Cidade: $cidade")
    println("Total de caracteres: ${cidade.length}")
    println("Captalize: ${cidade.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
    println("Lowercase: ${cidade.lowercase()}")
    println("Uppercase: ${cidade.uppercase()}")
    println("isEmpty: ${cidade.isEmpty()}")
    println("isBlank: ${cidade.isBlank()}")
    println("last: ${cidade.last()}")
    println("Reversed: ${cidade.reversed()}")
}