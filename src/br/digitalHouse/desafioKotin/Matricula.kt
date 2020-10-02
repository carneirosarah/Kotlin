package br.digitalHouse.desafioKotin

import java.util.*

// Construtor da classe Matricula contendo aluno e curso.
data class Matricula (val aluno: Aluno,
                      val curso: Curso
) {

    // O atributo dataMatricula e inicializado com a data do dia
    val dataMatricula: Date = Date()

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, dataMatricula=$dataMatricula)"
    }
}