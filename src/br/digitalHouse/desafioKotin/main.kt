package br.digitalHouse.desafioKotin

fun main() {
    val aluno = Aluno("Sarah", "Carneiro", 1)
    println(aluno.equals(Aluno("Pedro", "Silva", 1)))
    println(aluno.toString())
}