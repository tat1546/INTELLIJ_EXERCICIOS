//Tatiane Guzman
package fundamentos
fun main(args: Array<String>) {
    // Imprime o resultado da função 'soma' com os argumentos 2 e 3
    println(soma(2, 3))
    // Imprime o resultado da função 'soma' com o argumento 11 e o valor padrão de 'b' (que é 1)
    println(soma(11))

}
// Definição da função 'soma', que aceita dois parâmetros inteiros ('a' e 'b' com um valor padrão de 1)
fun soma(a: Int, b: Int = 1): Int {
    // Retorna a soma dos parâmetros 'a' e 'b'
    return a + b
}