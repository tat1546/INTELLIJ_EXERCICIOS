//Tatiane Guzman
package fundamentos
fun main(args: Array<String>) {
    // Declaração de uma variável mutável (var) 'a' do tipo Int, inicializada com o valor 32 (33.dec() é a forma de decrementar 1 de 33)
    var a: Int = 33.dec()
    // Declaração de uma variável mutável (var) 'b' do tipo String, inicializada com a conversão da variável 'a' para String
    var b: String = a.toString()
    // Imprime o valor da variável 'a'
    println("Int: $a")
    // Imprime o primeiro caractere da variável 'b' usando a função 'first()'
    println("Primeiro char da String b é: ${b.first()}")
}