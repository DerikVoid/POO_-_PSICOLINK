package classes;

import java.time.LocalDate;
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
	
	//Encapsulamento do atributo de registra a nota que o Clietnte atribui ao psicologo
	public Cliente getnota_registrar() {
		return nota_registrar;
	}
	public void setnota_registrar(Cliente nota_registrar) {
		Cliente.nota_registrar = nota_registrar;
	}
	
	//Mais um aytr
	private static ArrayList<Integer> avaliacoes = new ArrayList<>();
	private static Map<String, ArrayList<String>> Diariocliente = new HashMap<>();

	// Atributos de herança da classe mãe Pessoa

	public Cliente(String nome, int idade, String senha, String email, String cpf, String sexo) {
		super(nome, idade, senha, email, cpf, sexo);
	}

	 public static void Anotacao_c() {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("\n SISTEMA DE ANOTAÇÕES/DIÁRIO DO CLIENTE ");

	        System.out.print("Digite a data da Anotação: ");
	        String nomePaciente = scan.nextLine();

	        Diariocliente.putIfAbsent(nomePaciente, new ArrayList<>());
	        ArrayList<String> lista = Diariocliente.get(nomePaciente);

	        while (true) {
	            System.out.print("Digite sobre o que está pensando: ");
	            String anotacao = scan.nextLine();
	            lista.add(anotacao);

	            System.out.print("Deseja adicionar outra linha? (S/N): ");
	            String esc = scan.nextLine();
	            
	            if (esc.equalsIgnoreCase("N")) {
	                break;
	            }
	        }

	        System.out.println("\nAnotações salvas com sucesso!");
	        System.out.println("\n");
	    }

	    //Mostrar todas as anotações
	    public static void mostrarAnotacoes_c() {
	        //System.out.println("\n=== ANOTAÇÕES DO CLIENTE ===");

	        if (Diariocliente.isEmpty()) {
	            System.out.println("Nenhuma anotação registrada.");
	            return;
	        }

	        for (String cliente : Diariocliente.keySet()) {
	            System.out.println("\nDiário: " + cliente);
	            for (String nota : Diariocliente.get(cliente)) 
	                System.out.println("- " + nota);
	            }
	            
	        }

	// Método avaliar psicologo
	public void avaliarPsicologo() {
		/*
		 * Ideias: -Pegar a classe do psicologo e atribuir a ele uma nota de 1 a 10
		 * -Construir um atributo chamado de avaliacao dentro da classe psicologo e
		 * modifica-lo com o set e o get aqui dentro
		 */

	}

	// MÉTODO NOVO (pedido): registrar avaliação
	public static void avaliarPsicologo(Psicologo p, int avaliacao) {
		p.avaliacoes.add(avaliacao);

	}
	
	// == CONSULTAR A MENSALIDADE DO CONSULTORIO == //
	public static void consultarMensalidade() {
		//NEsta ele busca sempre a data atual do sistema
		LocalDate dataAtual = LocalDate.now();
		
		//Nesta linha ele busca sempre a 1 mês na frente e sempre no dia 7
		LocalDate dataFutura = dataAtual.plusMonths(1).withDayOfMonth(7);
		
		int dia_atual = dataAtual.getDayOfMonth();
		int mes_atual = dataAtual.getMonthValue();
		
		int mes_futuro = dataFutura.getDayOfMonth();
		int dia_futuro = dataFutura.getMonthValue();
		
		System.out.print("A mensalidade de suas consultas cairá no dia \n"
				+ "" + dataFutura + " \n"
				+ "restando até o pagamento \n"
				+ (dia_futuro - dia_atual) + " dias.");	
		}

}
