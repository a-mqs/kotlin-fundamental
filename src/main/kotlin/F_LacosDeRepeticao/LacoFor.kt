package F_LacosDeRepeticao

fun main(){

    for(i in 1..10){
        println("Valor no primeiro laço em i = $i");
    }

    println()

    for(i in 1..10 step 2){
        println("Valor no segundo laço em i = $i");
    }

    println()

    for(i in 10 downTo 1 step 2){
        println("Valor no terceiro laço em i = $i");
    }

}