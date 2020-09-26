package br.digitalHouse.desafioKotin

// Construtor da classe DigitalHouseManager contendo alunos, professores, cursos e matriculas.
class DigitalHouseManager (val alunos: MutableMap<Int, Aluno>,
                           val professores: MutableMap<Int, Professor>,
                           val cursos: MutableMap<Int, Curso>,
                           val matriculas: MutableMap<Int, Matricula>
){

    override fun toString(): String {
        return "DigitalHouseManager(alunos=$alunos, \n professores=$professores, \n cursos=$cursos, \n matriculas=$matriculas)"
    }
}