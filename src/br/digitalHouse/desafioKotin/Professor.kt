package br.digitalHouse.desafioKotin

// Construtor da classe Aluno contendo nome, sobrenome, tempo de casa e codigo do professor
data class Professor (var nome: String, var sobrenome: String, var tempoCasa: Int, val codigoProfessor: Int) {

    // Funcao que compara dois professores pelo seu codigo
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        return codigoProfessor == other.codigoProfessor
    }
}