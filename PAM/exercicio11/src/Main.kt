//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Declaração de duas variáveis imutáveis (val) 'num1' e 'num2' do tipo Int, inicializadas com os valores 2 e 3
    val num1: Int = 2
    val num2: Int = 3
    // Estrutura condicional 'if-else' que verifica qual valor entre 'num1' e 'num2' é maior
    val maiorValor = if(num1 > num2){
        // Se 'num1' for maior, imprime "processando..." e atribui 'num1' à variável 'maiorValor'
        println("processando...")
        num1
    } else {
        // Se 'num2' for maior (ou igual), imprime "processando..." e atribui 'num2' à variável 'maiorValor'
        println("processando...")
        num2
    }
    // Imprime a mensagem com o maior valor
    println("O maior valor é $maiorValor")
}