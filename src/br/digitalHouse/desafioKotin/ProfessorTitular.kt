package br.digitalHouse.desafioKotin

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