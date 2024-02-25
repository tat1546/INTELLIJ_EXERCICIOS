//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Declaração e inicialização de uma variável mutável (var) 'opcao' com o valor 0
    var opcao: Int = 0
    // Estrutura de repetição 'while' que executa enquanto a variável 'opcao' for diferente de -1
    while (opcao != -1){
        // Solicita a entrada do usuário e armazena em 'line'; se a entrada for nula, utiliza "0" como valor padrão
        val line = readLine() ?: "0"
        // Converte 'line' para Int, se possível; caso contrário, utiliza 0 como valor padrão
        opcao = line.toIntOrNull() ?: 0
        // Imprime a mensagem indicando a opção escolhida pelo usuário
        println("Você escolheu a opção $opcao")
    }
    // Ao sair do loop, imprime a mensagem de despedida
    println("Até a próxima!")
}