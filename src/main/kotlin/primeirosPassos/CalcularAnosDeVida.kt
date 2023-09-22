package primeirosPassos

fun main(){

    // Entrada de dados
    var anoDeNascimento = 2000
    var anoAtual = 2023

    calcularAnosDeVida(anoDeNascimento, anoAtual);

    imprimirResultados(anoDeNascimento, anoAtual)

}

fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida
}

fun imprimirResultados(anoDeNascimento: Int, anoAtual: Int){
    print("Como calcular quantos anos de vida uma pessoa tem?\n\n")
    print("Ano de nascimento: $anoDeNascimento\n")
    print("Ano de atual: $anoAtual\n")
    print("Resultado: ${calcularAnosDeVida(anoDeNascimento, anoAtual)}\n")
    print("Você tem ${calcularAnosDeVida(anoDeNascimento, anoAtual)} anos de vida\n")


}