package br.digitalHouse.desafioKotin

fun main() {
    val aluno = Aluno("Sarah", "Carneiro", 1)
    println(aluno.equals(Aluno("Pedro", "Silva", 1)))
    println(aluno.toString())

    val curso = Curso("teste", 1)
    println(curso.equals(Curso("teste2", 1)))
    println(curso.toString())

    val professor = Professor("prof", "teste", 1, 1)
    println(professor.equals(Professor("prof2", "teste2", 4, 1)))
    println(professor.toString())
}