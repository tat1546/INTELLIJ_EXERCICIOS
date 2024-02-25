//Tatiane Guzman
package funcoes
// Função inline 'transacao' que recebe uma função sem parâmetros e retorno ('() -> Unit')
inline fun transacao(funcao: () -> Unit) {
    // Mensagem indicando o início da transação
    println("abrindo transação...")
    try {
        // Executa a função passada como argumento
        funcao()
    } finally {
        // Bloco 'finally' é sempre executado, indicando o fechamento da transação
        println("fechando transação")
    }
}
// Função principal, ponto de entrada do programa
fun main(args: Array<String>) {
    // Chamada da função 'transacao'
    transacao {
        // Mensagens indicando a execução de consultas SQL
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}