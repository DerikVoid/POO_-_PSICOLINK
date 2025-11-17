package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {

	
	//Atributos

	
	
	
	
	//Atributos de herança da classe mãe Pessoa
	public Cliente(String nome, int idade, String senha, String email, String cpf, String sexo) {
		super(nome, idade, senha, email, cpf, sexo);
		
	}
	
	//Método anotação
	public void enviarAnotacao_c() {
		//Ele chama o método da classe mãe Pessoa, que vai rodar juntamente com o que vai ser criado em seguida
		super.Anotacao();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deseja enviar ao pscicólogo?");
		String esc = scan.nextLine();
		
		if(esc.equalsIgnoreCase("sim")) {
			//Puxa a lista de anotações da classe Pessoa
			ArrayList<String> minhasMensagens = getMensagens();   
			// Ideia: se for sim é auto-incrementada o getMensgens() na classe psicólogo se não não acontece.
			
			
		}
		
	}
	
	//Método avaliar psicologo
	public void avaliarPsicologo() {
			/*Ideias:
		   -Pegar a classe do psicologo e atribuir a ele uma nota de 1 a 10
		   -Construir um atributo chamado de avaliacao  dentro da classe psicologo e modifica-lo com o set e o get aqui dentro
		   */
		
	}		

}
