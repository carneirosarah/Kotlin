package br.digitalHouse.desafioKotin

class ProfessorAdjunto (nome: String,
                        sobrenome: String,
                        tempoCasa: Int,
                        codigoProfessor: Int,
                        var horasMentortia: Int
) : Professor(nome, sobrenome, tempoCasa, codigoProfessor){

    override fun toString(): String {
        return "Professor Adjunto(nome='${nome}', sobrenome='${sobrenome}', " +
                "tempo de casa = ${tempoCasa}, codigo = ${codigoProfessor}, horas de mentoria='${horasMentortia}')"
    }
}