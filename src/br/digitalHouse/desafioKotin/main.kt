package br.digitalHouse.desafioKotin

fun main() {

    val digitalHouseManager = DigitalHouseManager(mutableMapOf<Int, Aluno>(), mutableMapOf<Int, Professor>(), mutableMapOf<Int, Curso>(), mutableMapOf<Int, Matricula>())

    // registra dois professores titulares
    digitalHouseManager.registrarProfessorTitular("Maria", "Silva", 1, "Kotlin")
    digitalHouseManager.registrarProfessorTitular("Laura", "Santos", 2, "Java")

    // registra dois professores adjuntos
    digitalHouseManager.registrarProfessorAdjunto("Carolina", "Souza", 3, 8)
    digitalHouseManager.registrarProfessorAdjunto("Marcia", "Gomes", 4, 6)

    // registra dois cursos
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    // aloca um professor titular e um adjunto para cada curso
    digitalHouseManager.alocarProfessores(20001, 2,4)
    digitalHouseManager.alocarProfessores(20002, 1,3)

    // registra cinco alunos
    digitalHouseManager.matricularAluno("Pedro", "Passos", 1)
    digitalHouseManager.matricularAluno("Aline", "Jardim", 2)
    digitalHouseManager.matricularAluno("Mariana", "Monteiro", 3)
    digitalHouseManager.matricularAluno("Mateus", "Lima", 4)
    digitalHouseManager.matricularAluno("Fernanda", "Pacheco", 5)

    // matricula dois alunos no curso de Full Stack
    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)

    // matricula tres alunos no curso de Android
    digitalHouseManager.matricularAluno(3, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(5, 20002)

    println(digitalHouseManager.toString())
}