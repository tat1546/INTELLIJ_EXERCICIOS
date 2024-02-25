//Tatiane Guzman
package funcoes
// Função inline 'executarComLog' que recebe o nome da função e uma função com retorno genérico ('() -> T')
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    // Mensagem indicando a entrada na função
    println("Entrando no método $nomeFuncao...")
    try {
        // Executa a função passada como argumento e retorna seu resultado
        return funcao()
    } finally {
        // Bloco 'finally' é sempre executado, indicando a finalização da função
        println("Método $nomeFuncao finalizando...")
    }
}
// Função 'somar' que recebe dois inteiros e retorna a soma deles
fun somar(a: Int, b: Int): Int{
    return a + b
}
// Função principal, ponto de entrada do programa
fun main(args: Array<String>) {
    // Chamada da função 'executarComLog' para envolver a função 'somar' com logs
    val resultado = executarComLog("somar"){
        // Chamada da função 'somar' com argumentos 4 e 5
        somar(4,5)
    }
    // Imprime o resultado da soma
    println(resultado)
}