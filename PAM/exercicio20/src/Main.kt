//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Rótulo 'loop' associado ao loop 'for' externo
    loop@for (i in 1 .. 15){
        // Loop 'for' interno
        for (j in 1 .. 15){
            // Verifica se i é igual a 2 e j é igual a 9
            if(i == 2 && j == 9)
            // Se verdadeiro, encerra o loop  usando 'break@loop'
                break@loop
            // Imprime os valores de i e j
            println("$i $j")
        }
    }
    // Imprime "Fim!" após o término dos loops
    println("Fim!")
}