//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Loop 'for' que vai de 0 até 100 com incrementos de 5
    for(i in 0 .. 100 step 5) {
        // Imprime o valor atual de 'i'
        println(i)
    }
    // Loop 'for' que vai de 100 até 0 com decrementos de 5
    for(i in 100 downTo 0 step 5){
        // Imprime o valor atual de 'i'
        println(i)
    }
}