package OrientacaoObjeto.composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	
	
	public Aluno(String nome) {
		
		this.nome = nome;
	
	}


	Curso obterCursoPorNome(String nome) {
		for(Curso curso: cursos) {
			if(curso.nomeCurso.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
