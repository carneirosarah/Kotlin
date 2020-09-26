package br.digitalHouse.desafioKotin

fun main() {
    val aluno = Aluno("Sarah", "Carneiro", 1)
    println(aluno.equals(Aluno("Pedro", "Silva", 1)))
    println(aluno.toString())

    val curso = Curso("teste", 1)
    println(curso.equals(Curso("teste2", 1)))
    println(curso.toString())

    val professorTitular = ProfessorTitular("prof", "teste", 1, 1, "teste")
    println(professorTitular.equals(ProfessorTitular("prof2", "teste2", 4, 1, "teste2")))
    println(professorTitular.toString())

    val professorAdjunto = ProfessorAdjunto("adj", "teste3", 5, 2, 8)
    println(professorAdjunto.equals(ProfessorAdjunto("profadj", "teste4", 6, 2, 1)))
    println(professorAdjunto.toString())
}