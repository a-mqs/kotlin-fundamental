package ZZ_exercicios

fun main(){

    println("CONVERSOR DE MEDIDAS\n")

    println("Informe a quantidade de pés: ")
    var pes: Int = readln().toInt()

    var polegadas = converterPesEmPolegadas(pes)
    println("$pes pés, valem $polegadas polegadas")

    var jardas = converterPesEmJardas(pes)
    println("$pes pés, valem $jardas polegadas")

    var milhas = converterPesEmMilhas(jardas)
    println("$pes pés, valem $milhas polegadas")

}

fun converterPesEmPolegadas(pes: Int): Int {

    return pes * 12
}
fun converterPesEmJardas(pes: Int): Double {

    return pes / 3.0
}

fun converterPesEmMilhas(jardas: Double): Double {

    return jardas / 1760
}