package OrientacaoObjeto.composicao;

public class CursosTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Isaque");
		Aluno aluno2 = new Aluno("Gabriel");
		Aluno aluno3 = new Aluno("REis");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Py completo");
		Curso curso3 = new Curso("Js completo");
	
		
		System.out.println(curso1.nomeCurso);
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);

		

		aluno1.obterCursoPorNome("Java completo");
	}
}
