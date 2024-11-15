package OrientacaoObjeto.composicao;

import java.util.ArrayList;

public class Curso {
	
	final String nomeCurso;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	Curso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	void adicionarAluno(Aluno aluno){
		//relacao bi-direcional
		//um curso tem varios alunos
		this.alunos.add(aluno);
		//um aluno tem varios cursos
		aluno.cursos.add(this);
	}
	
	
	
}
