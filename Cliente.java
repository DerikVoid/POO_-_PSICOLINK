package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente extends Pessoa {

	// Atributos
	//Ideias de atributos diferenste de Psicologo
	String avaliacao;
	Double mensalidade;
	String agendamento;
		private static Cliente nota_registrar;
		public Cliente getnota_registrar() {
		return nota_registrar;
		}
		public void setnota_registrar (Cliente nota_registrar) {
		Cliente.nota_registrar = nota_registrar;
		}
	
	// private static Cliente Avaliacao_registrar;
    //public static Cliente getAvaliacao_registrar() {
		//return Avaliacao_registrar;
	//}
	//public static void setAvaliacao_registrar(Cliente Avaliacao_registrar) {
		//Cliente.Avaliacao_registrar = Avaliacao_registrar;
	//}
    private static ArrayList<Integer> avaliacoes = new ArrayList<>();

	
	public Cliente(String nome, int idade, String senha, String email, String cpf, String sexo) {
		super(nome, idade, senha, email, cpf, sexo);

	}

	// Método anotação
	public void enviarAnotacao_c() {
		// Ele chama o método da classe mãe Pessoa, que vai rodar juntamente com o que
		// vai ser criado em seguida
		super.Anotacao();
		Scanner scan = new Scanner(System.in);

		System.out.println("Deseja enviar ao pscicólogo?");
		String esc = scan.nextLine();

		if (esc.equalsIgnoreCase("sim")) {
			// Puxa a lista de anotações da classe Pessoa
			ArrayList<String> minhasMensagens = getMensagens();
			// Ideia: se for sim é auto-incrementada o getMensgens() na classe psicólogo se
			// não não acontece.

		}

	}

    // MÉTODO NOVO (pedido): registrar avaliação
    public static void avaliarPsicologo(Psicologo p, int avaliacao) {
        p.avaliacoes.add(avaliacao);
        System.out.println("Avaliação adicionada");
        
    }

}
