//Tatiane Guzman
package fundamentos
fun main(args: Array<String>) {
    // Declaração de uma variável imutável (val) 'nota' com o valor 9
    val nota = 9
    // Estrutura condicional 'if-else' usando o operador range para avaliar a nota
    if (nota in 9..10) {
        println("Fatástico")
    } else if (nota in 7..8) {
        println("Parabéns")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3){
        println("Te vejo no próximo ano")
    } else {
        println("Nota inválida")
    }
}