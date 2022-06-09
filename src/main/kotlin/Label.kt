fun main() {

    LoopI@ for (i in 1..10){
        LoopJ@ for (j in 1..10){
            if (i > 5){
                break@LoopI
            }
            println("$i * $j = ${i*j}")
        }
    }
}