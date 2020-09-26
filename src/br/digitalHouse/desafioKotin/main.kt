package br.digitalHouse.desafioKotin

fun main() {
    val aluno = Aluno("Sarah", "Carneiro", 1)
    println(aluno.equals(Aluno("Pedro", "Silva", 1)))
    println(aluno.toString())

    val curso = Curso("teste", 1)
    println(curso.equals(Curso("teste2", 1)))
    println(curso.toString())
}