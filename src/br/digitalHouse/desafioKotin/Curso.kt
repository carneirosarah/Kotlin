package br.digitalHouse.desafioKotin

import kotlin.reflect.typeOf

/* Construtor da classe Curso contendo nome, codigo do curso, professor titular,
professorAjunto, um map de alunos e a quantidade maxima de alunos */
class Curso (var nome: String,
             val codigoCurso: Int,
             var professorTitular: ProfessorTitular?,
             var professorAdjunto: ProfessorAdjunto?,
             var alunos: MutableMap<Int, Aluno>,
             var qtdMaxAlunos: Int
) {
    var qtdAtualAlunos = 0 // Guarda a quantidade de alunos matriculados no curso
    var vagasDisponiveis = qtdMaxAlunos // Guarda o numero de vaga disponiveis no  curso

    // metodo que consulta se um aluno está contido na lista de alunos do curso
    fun consultarAluno(aluno: Aluno?): Boolean = alunos.containsValue(aluno)

    // metodo que adiciona um aluno ao curso quando este não está contido na lista de alunos e existem vagas disponiveis
    fun adicionarAluno(aluno: Aluno?): Boolean {

        when {
            !consultarAluno(aluno) && vagasDisponiveis > 0 -> {
                alunos.put(aluno!!.codigoAluno, aluno)
                qtdAtualAlunos++
                vagasDisponiveis--
                return true
            } else -> return false
        }
    }

    // metodo que exclui um aluno do curso quando este está contido na lista de alunos
    fun excluirAluno(aluno: Aluno): Boolean {

        when {
            consultarAluno(aluno) -> {
                alunos.remove(aluno.codigoAluno)
                qtdAtualAlunos --
                vagasDisponiveis ++
                return true
            } else -> return false
        }
    }

    // metodo que compara dois cursos pelo seu codigo
    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        return codigoCurso == other.codigoCurso
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, \n professorTitular=$professorTitular, " +
                "professorAdjunto=$professorAdjunto, \n alunos=$alunos, \n qtdMaxAlunos=$qtdMaxAlunos, " +
                "qtdAtualAlunos=$qtdAtualAlunos, vagasDisponiveis=$vagasDisponiveis)"
    }
}