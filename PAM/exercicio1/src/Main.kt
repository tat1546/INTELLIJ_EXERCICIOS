//Tatiane Guzman
package fundamentos
fun main(args: Array<String>) {
    //Tipos Númericos Inteiros
    val num1: Byte =127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807
    //Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14
    //Tipo Caractere
    val char: Char ='?' //outros exemplos...'1','k',' '
    //Tipo boolean
    val boolean: Boolean = true // ou false
    // Imprime uma lista com os valores das variáveis declaradas
    println(listOf(num1, num2, num3,num4, num5, num6, char,boolean))
    // Verifica se 2 é do tipo Int
    println(2 is Int)
    // Verifica se 2147483648 é do tipo Long
    println(2147483648 is Long)
    // Verifica se 1.0 é do tipo Double
    println(1.0 is Double)
    // Tudo é objeto
    println(10.dec())
}