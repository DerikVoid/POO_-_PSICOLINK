package classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Cliente pessoa = new Cliente("Carlos", 29, "23", "c@c", "123", "M");
		Psicologo psicologo = new Psicologo("Joao", 47, "33", "e@e", "321", "M");
		pessoa.avaliarPsicologo(psicologo, 5);
		pessoa.avaliarPsicologo(psicologo, 7);
		System.out.println("Avaliação média do psicológo:"+ psicologo.getAvaliacaoMedia());
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja bem-vindo ao Psicolink!! \n " + "qual o seu formato de entrada no sistema: \n"
				+ "[1] Cliente \n" + "[2] Psicologo \n" + "[3] Empresa");
		int entrada = scan.nextInt();
		scan.nextLine();
		// Cliente
		if (entrada == 1) {

			// Entrada de dados do cliente
			System.out.println("Digite seu nome:");
			String nome = scan.nextLine();

			System.out.println("Digite sua idade:");
			int idade_c = scan.nextInt();
			scan.nextLine();

			System.out.println("Digite sua senha:");
			String senha_c = scan.nextLine();

			System.out.println("Digite seu email:");
			String email_c = scan.nextLine();

			System.out.println("Digite seu CPF:");
			String cpf_c = scan.nextLine();

			System.out.println("Digite seu sexo:");
			String sexo_c = scan.nextLine();

			Cliente cliente1 = new Cliente(nome, idade_c, senha_c, email_c, cpf_c, sexo_c);

			System.out.println("OK! tudo pronto " + cliente1.getNome());
			System.out.println("Deseja utilizar alguma função?");
			System.out.println("[1] Meu diário pessoal. \n"
					+ "[2] Avaliar psicólogo \n"
					+ "[3] Consultar mensalidade do consultório");
			int esc_p = scan.nextInt();
			scan.nextLine();
			if(esc_p == 1) {
				Psicologo.Anotacao_p(); 
			}
				
		
			if (esc_p == 2) {
				System.out.println("Faça sua anotação:");
				int test_p = scan.nextInt();
				scan.nextLine();
				//Cliente.receberAvaliacao(test_p); 
				
			}
		}

		// Psicologo
		if (entrada == 2) {

			// Caso uma empresa se cadastre vai funcionar do msm jeito, mas com os dados da
			// empresa

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

			// Criação de uma empresa genérica caso uma não tenha sido cadastrada ainda.
			// Logo em seguida com a msm são criados email e senha para o psicologo com as
			// caracteristicas desta

			// Criação de email e senha por meio de um método da classe empresa
			Empresa empresa_g;

			if (Empresa.getEmpresa_criada() == null) {
				empresa_g = Empresa.EmpresaGenerica();

			} else {
				empresa_g = Empresa.getEmpresa_criada();
			}

			String email_gerado = Empresa.CD(psicologo1);
			psicologo1.setEmail(email_gerado);

			System.out.println("Seu email e senha da empresa: " + email_gerado + "  " + psicologo1.getCpf());
			
			System.out.println("OK! tudo pronto " + psicologo1.getNome());
			System.out.println("Deseja utilizar alguma função?");
			System.out.println("[1] Meu diário pessoal. \n"
					+ "[2] Ver suas avaliações. \n"
					+ "[3] Consultar mensalidade do consultório");
			int esc_p = scan.nextInt();
			scan.nextLine();
			if(esc_p == 1) {
				Psicologo.Anotacao_p(); 
			}
				
			
			
			
			
	}

		// Empresa
		if (entrada == 3) {
			Empresa.CriacaoEmpresa();
			System.out.println("");

		}
	}
}
