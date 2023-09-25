package ZZ_exercicios

fun main(){

    println("Cálculo da área do triânglo")

    println("Informe a medida da base: ")
    var base: Int = readln().toInt()

    println("Informe a medida da altura: ")
    var altura: Int = readln().toInt()

    var areaDoTriangulo = calcularAreaDoTriangulo(base, altura)

    println("Área = $areaDoTriangulo")

}

fun calcularAreaDoTriangulo(base: Int, altura: Int): Int {

    return (base * altura) / 2

}