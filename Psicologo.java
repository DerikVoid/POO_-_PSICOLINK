package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Psicologo extends Pessoa{
	
		
	//Construtor

	public Psicologo(String nome, int idade, String senha, String email, String cpf, String sexo) {
		super(nome, idade, senha, email, cpf, sexo);
		//this.registro = registro;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome_p;
	}
	

	//Métodos anotacao
	public void Anotacao_p() {
		super.Anotacao();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Registrar anotação do seu paciente?");
		//Mesmo tipo de relação do cliente com psicologo porem agora sera com a classe empresa
		
	}

	
	
}


