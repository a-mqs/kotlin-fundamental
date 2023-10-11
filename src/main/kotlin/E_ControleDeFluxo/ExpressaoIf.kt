package E_ControleDeFluxo

fun main(){
    var valorA = 8
    var valorB = 20

    var i = 23

    if ((i == null) || (valorA <= 8) ){
        processar()
    }

    if (i != null){
        naoProcessar()
    }

    print("FIM...")
}

fun processar(){
    println("TRUE")
}

fun naoProcessar(){
    println("FALSE")
}