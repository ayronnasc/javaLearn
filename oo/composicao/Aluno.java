package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();  // lista constante -> nao eh constante os elementos dentro da  lista e sim o seu lugar na memoria
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
}
