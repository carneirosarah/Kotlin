package br.digitalHouse.desafioKotin

// Construtor da classe Curso contendo nome, e codigo do curso
data class Curso (var nome: String,
                  val codigoCurso: Int
) {

    // Funcao que compara dois cursos pelo seu codigo
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        return codigoCurso == other.codigoCurso
    }
}