package br.digitalHouse.desafioKotin

// Construtor da classe DigitalHouseManager contendo alunos, professores, cursos e matriculas.
class DigitalHouseManager (val alunos: MutableMap<Int, Aluno>,
                           val professores: MutableMap<Int, Professor>,
                           val cursos: MutableMap<Int, Curso>,
                           val matriculas: MutableMap<Int, Matricula>
){
    // metodo que consulta se um curso está contido na lista de cursos
    fun consultarCurso(codigoCurso: Int): Boolean = cursos.contains(codigoCurso)

    // metodo que registra um curso
    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxAlunos: Int) {

        val curso = Curso(nome, codigoCurso, null, null, mutableMapOf<Int, Aluno>(), qtdMaxAlunos)
        cursos.put(codigoCurso, curso)
        println("[Digital House] Curso resgistrado com sucesso!!")
    }

    // metodo que exclui um curso
    fun excluirCurso(codigoCurso: Int) {

        when{
            consultarCurso(codigoCurso) -> {
                cursos.remove(codigoCurso)
                println("[Digital House] Curso removido com sucesso!!")
            } else -> println("[Digital House] O curso informado não existe!!")
        }
    }

    // metodo que consulta se um professor está contido na lista de professores
    fun consultarProfessor(codigoProfessor: Int): Boolean = professores.contains(codigoProfessor)

    // metodo que registra um professor adjunto
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {

        val profAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        professores.put(codigoProfessor, profAdjunto)
        println("[Digital House] Professor Adjunto resgistrado com sucesso!!")
    }

    // metodo que registra um professor titular
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val profTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        professores.put(codigoProfessor, profTitular)
        println("[Digital House] Professor Titular resgistrado com sucesso!!")
    }

    // metodo que exclui um professor
    fun excluirProfessor(codigoProfessor: Int) {

        when{
            consultarProfessor(codigoProfessor) -> {
                professores.remove(codigoProfessor)
                println("[Digital House] Professor removido com sucesso!!")
            } else -> println("[Digital House] O professor informado não existe!!")
        }
    }

    // metodo que consulta se um aluno está contido na lista de alunos
    fun consultarAluno(codigoAluno: Int): Boolean = alunos.contains(codigoAluno)

    // metodo que registra um aluno
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val aluno = Aluno(nome, sobrenome, codigoAluno)
        alunos.put(codigoAluno, aluno)
    }

    // metodo que matricula um aluno em um curso
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        when {
            consultarAluno(codigoAluno) && consultarCurso(codigoCurso) -> {
                if ((cursos[codigoCurso])!!.adicionarAluno(alunos[codigoAluno])) {
                    val matricula = Matricula((alunos[codigoAluno] as Aluno), (cursos[codigoCurso] as Curso))
                    matriculas.put(codigoAluno, matricula)
                    println("[Digital House] Matricula realizada com sucesso!!")
                } else {
                    println("[Digital House] Não há vagas disponiveis no curso informado!!")
                }
            }
            consultarAluno(codigoAluno) -> println("[Digital House] O aluno informado não existe!!")
            consultarCurso(codigoCurso) -> println("[Digital House] O curso informado não existe!!")
            else -> println("[Digital House] O  aluno e curso informados não existem!!")
        }
    }

    // metodo que aloca professores a um curso
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        when {
            consultarCurso(codigoCurso) && consultarProfessor(codigoProfessorTitular) && consultarProfessor(codigoProfessorAdjunto) -> {
                (cursos[codigoCurso])!!.professorTitular = professores[codigoProfessorTitular] as ProfessorTitular?
                (cursos[codigoCurso])!!.professorAdjunto = professores[codigoProfessorAdjunto] as ProfessorAdjunto?
                println("[Digital House] Professores alocados com sucesso!!")
            }
            consultarCurso(codigoCurso) -> println("[Digital House] O curso informado não existe!!")
            consultarProfessor(codigoProfessorTitular) -> println("[Digital House] O professor titular informado não existe!!")
            consultarProfessor(codigoProfessorAdjunto) -> println("[Digital House] O professor adjunto informado não existe!!")
            else -> println("[Digital House] O  curso e professores informados não existem!!")
        }
    }

    override fun toString(): String {
        return "DigitalHouseManager(alunos=$alunos, \n professores=$professores, \n cursos=$cursos, \n matriculas=$matriculas)"
    }
}