//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Loop 'for' que vai de 1 até 10 (inclusive)
    for (i in 1 .. 10){
        // Verifica se o valor de 'i' é igual a 5
        if(i == 5){
            // Se verdadeiro, encerra o loop  usando 'break'
            break
        }
        // Imprime o valor de 'i' se a condição do 'if' não for atendida
        println("Atual: $i")
    }
}