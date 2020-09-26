package br.digitalHouse.desafioKotin

/* Construtor da classe Curso contendo nome, codigo do curso, professor titular,
professorAjunto, um map de alunos e a quantidade maxima de alunos */
data class Curso (var nome: String,
                  val codigoCurso: Int,
                  var professorTitular: ProfessorTitular,
                  var professorAdjunto: ProfessorAdjunto,
                  var alunos: MutableMap<Int, Aluno>,
                  var qtdMaxAlunos: Int
) {

    // Funcao que compara dois cursos pelo seu codigo
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        return codigoCurso == other.codigoCurso
    }
}