//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Declaração de uma variável imutável (val) 'nota' com o valor 4
    val nota = 4
    // Estrutura de controle 'when' para avaliar a nota
    when (nota){
        // Caso a nota seja 10 ou 9, imprime "Fantástico"
        10, 9 -> print("Fantástico")
        // Caso a nota seja 8 ou 7, imprime "Parabéns"
        8, 7 -> print("Parabéns")
        // Caso a nota seja 6, 5 ou 4, imprime "Tem como recuperar"
        6, 5, 4 -> print("Tem como recuperar")
        // Caso a nota esteja no range de 3 a 0 (inclusive), imprime "Te vejo próximo semestre"
        in 3 ..0 -> print("Te vejo próximo semestre")
        // Caso a nota não esteja em nenhuma das opções anteriores, imprime "Nota inválida"
        else -> print("Nota inválida")
    }
}