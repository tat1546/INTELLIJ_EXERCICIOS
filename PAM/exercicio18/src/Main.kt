//Tatiane Guzman
package fundamentos.controles
fun main(args: Array<String>) {
    // Lista de alunos utilizando ArrayList
    val alunos = arrayListOf("André", "Carla", "Marcos")
    // Loop 'for' que itera sobre a lista 'alunos' com seus índices usando a função 'withIndex()'
    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno \n")
    }
}