package br.digitalHouse.desafioKotin

import java.util.*

data class Matricula (val aluno: Aluno, val curso: Curso) {
    val dataMatricula: Date = Date()
    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, dataMatricula=$dataMatricula)"
    }


}