package br.digitalHouse.desafioKotin

// Construtor da classe Aluno contendo nome, sobrenome e codigo do aluno
data class Aluno (var nome: String,
                  var sobrenome: String,
                  val codigoAluno: Int
) {

    // Funcao que compara dois alunos pelo seu codigo
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        return codigoAluno == other.codigoAluno
    }
}