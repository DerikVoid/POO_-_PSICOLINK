package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Psicologo extends Pessoa {
	// Construtor
	// Ideias de atributos diferenste de Cliente
	Double salario;
	static int sessoes;
	ArrayList<Integer> avaliacoes = new ArrayList<>();
	private static Map<String, ArrayList<String>> anotacoesPacientes = new HashMap<>();
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static int getSessoes() {
		return sessoes;
	}

	public void setSessoes(int sessoes) {
		this.sessoes = sessoes;
	}
	
	 public double getAvaliacaoMedia() {
	    	double avaliacaoMedia = 0;
	    	int soma = 0;

	    	for (Integer num : this.avaliacoes) {
	    	    soma += num;
	    	}

	    	avaliacaoMedia = soma / this.avaliacoes.size();
	    	return avaliacaoMedia;
	    }

	
	// Atributos de herança da classe mãe Pessoa
    public Psicologo(String nome, int idade, String senha, String email, String cpf, String sexo) {
        super(nome, idade, senha, email, cpf, sexo);
    }
    
 

    public static void Anotacao_p() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n SISTEMA DE ANOTAÇÕES DO PSICÓLOGO ");

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scan.nextLine();

        anotacoesPacientes.putIfAbsent(nomePaciente, new ArrayList<>());
        ArrayList<String> lista = anotacoesPacientes.get(nomePaciente);

        while (true) {
            System.out.print("Digite a anotação: ");
            String anotacao = scan.nextLine();
            lista.add(anotacao);

            System.out.print("Deseja adicionar outra anotação? (S/N): ");
            String esc = scan.nextLine();

            if (esc.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("\nAnotações salvas com sucesso!");
        System.out.println("\n");
    }

    //Mostrar todas as anotações
    public static void mostrarAnotacoes() {
        //System.out.println("\n=== ANOTAÇÕES DO PSICÓLOGO ===");

        if (anotacoesPacientes.isEmpty()) {
            System.out.println("Nenhuma anotação registrada.");
            return;
        }

        for (String paciente : anotacoesPacientes.keySet()) {
            System.out.println("\nPaciente: " + paciente);
            for (String nota : anotacoesPacientes.get(paciente)) 
                System.out.println("- " + nota);
            }
            
        }
    
    public static Psicologo CriacaoPsicologo() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Digite seu nome:");
		String nome_p = scan.nextLine();

		System.out.println("Digite sua idade:");
		int idade_p = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite seu CPF:");
		String cpf_p = scan.nextLine();

		System.out.println("Digite seu sexo:");
		String sexo_p = scan.nextLine();

		Psicologo psicologo1 = new Psicologo(nome_p, idade_p, "1111", "email@alter", cpf_p, sexo_p);
		return psicologo1;
    }

    
    
    // Método de adicionar o numero de seções:
    public void numeroSessoes () {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Quantas seções no mês foram registradas?");
    	int sessoes = scan.nextInt();
    	this.setSessoes(sessoes);
    	}
    
}    
 
    // (opcional) Média das avaliações
    //public static double MediaAvaliacoes(Cliente nota_registrar) {
        //if (Cliente.get(nota_registrar)) return 0;

        //int soma = 0;
//        for (int n : avaliacoes) {
//            soma += n;
//        }
//        return (double) soma / avaliacoes.size();
//    }
//}
