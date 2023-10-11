package E_ControleDeFluxo

fun main(){
    var valorA = 8
    var valorB = 20

    var i = 23

    if ((i == null)){
        executarProcessamento()
    }

    else {
        naoExecutarProcessamento()
    }

    print("FIM...")
}

fun executarProcessamento(){
    println("TRUE")
}

fun naoExecutarProcessamento(){
    println("FALSE")
}