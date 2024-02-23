package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria");
		Aluno aluno2 = new Aluno("Joao");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("php");
		Curso curso3 = new Curso("python");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("E o meu nome eh " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
	}
}
