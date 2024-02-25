//Tatiane Guzman
package fundamentos
fun main(args: Array<String>) {
    // Declaração de uma variável imutável (val) chamada 'bomHumor' com o valor 'true'
    val bomHumor = true
    //imprimi uma mensagem
    print("Hoje estou ${if(bomHumor) "feliz" else "chateado"}")
}