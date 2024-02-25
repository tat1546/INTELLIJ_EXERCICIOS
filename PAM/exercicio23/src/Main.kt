//Tatiane Guzman
package funcoes
fun main(args: Array<String>) {
    // Chama a função 'min' e imprime o resultado
    print("O menor valor é ${min(3,4)}")
}
// Função 'min' que recebe dois parâmetros inteiros e retorna o menor deles
fun min(a: Int, b:Int): Int {
    // Usa uma expressão condicional para determinar o menor valor entre 'a' e 'b
    return if (a < b) a else b
}