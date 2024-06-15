package cursojava.exec;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno  aluno1 = new Aluno();
		
		aluno1.setNome("Joao da silva");
		aluno1.setIdade(25);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.4544.545");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setNomeEscola("Escola JDEV");
		aluno1.setNota1(90);
		aluno1.setNota2(88.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Media da nota e = "+aluno1.getMediaNota());
		
	}

}
