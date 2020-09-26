package br.digitalHouse.desafioKotin

// Construtor da classe ProfessorTitular contendo nome, sobrenome, tempo de casa, codigo do professor e especialidade
class ProfessorTitular (nome: String,
                       sobrenome: String,
                       tempoCasa: Int,
                       codigoProfessor: Int,
                       var especialidade: String
) : Professor(nome, sobrenome, tempoCasa, codigoProfessor){

    override fun toString(): String {
        return "Professor Titular(nome='${nome}', sobrenome='${sobrenome}', " +
                "tempo de casa = ${tempoCasa}, codigo = ${codigoProfessor}, especialidade='${especialidade}')"
    }
}